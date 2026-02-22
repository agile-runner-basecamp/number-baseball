package baseball;

import baseball.domain.BallNumbers;
import baseball.domain.RandomNumbersGenerator;
import baseball.domain.Result;
import baseball.view.InputView;
import baseball.view.ResultView;

public class BaseballGame {
    private final RandomNumbersGenerator numbersGenerator;

    public BaseballGame() {
        this(new RandomNumbersGenerator());
    }

    public BaseballGame(RandomNumbersGenerator numbersGenerator) {
        this.numbersGenerator = numbersGenerator;
    }

    public void play() {
        boolean playing = true;
        while (playing) {
            runSingleGame();
            playing = shouldRestart();
        }
    }

    private void runSingleGame() {
        BallNumbers computerNumbers = BallNumbers.from(numbersGenerator.generate());
        Result result = Result.empty();
        while (!result.isWin()) {
            BallNumbers playerNumbers = readPlayerNumbers();
            result = computerNumbers.compare(playerNumbers);
            ResultView.printResult(result);
        }
        ResultView.printGameEnd();
    }

    private BallNumbers readPlayerNumbers() {
        String input = InputView.readNumbers();
        return BallNumbers.from(input);
    }

    private boolean shouldRestart() {
        String command = InputView.readRestartCommand();
        return toRestartFlag(command);
    }

    private boolean toRestartFlag(String command) {
        return "1".equals(command);
    }
}
