package baseball;

import baseball.io.InputHandler;
import baseball.io.OutputHandler;
import baseball.util.RandomNumbersGenerator;

import java.util.List;

public class Baseball {

    public static final int STRIKE_INDEX = 1;
    public static final int TARGET_COUNT = 3;

    private InputHandler inputHandler;
    private OutputHandler outputHandler;
    private Umpire umpire;
    private RandomNumbersGenerator randomNumbersGenerator;

    private GameStatus gameStatus;
    private List<Integer> target;

    public Baseball(InputHandler inputHandler, OutputHandler outputHandler, Umpire umpire, RandomNumbersGenerator randomNumbersGenerator) {
        this.inputHandler = inputHandler;
        this.outputHandler = outputHandler;
        this.umpire = umpire;
        this.randomNumbersGenerator = randomNumbersGenerator;
    }

    public void run() {
        initializeGame();

        while (gameStatus.isRunning()) {
            playSingleRound();
        }
    }

    private void initializeGame() {
        gameStatus = GameStatus.PLAYING;
        target = randomNumbersGenerator.generate();
    }

    private void playSingleRound() {
        outputHandler.showMessageForUserInput();
        List<Integer> digits = inputHandler.getDigits();

        int[] call = umpire.makeCall(digits, target);
        outputHandler.showRoundResult(call);

        if (call[STRIKE_INDEX] == TARGET_COUNT) {
            outputHandler.showGameWinningComment();
            gameStatus = GameStatus.WINNING;
        }

        if (gameStatus.isWinning()) {
            handleRestart();
        }
    }

    private void handleRestart() {
        outputHandler.showMessageForNextRound();
        int selection = inputHandler.getRestartSelection();

        if (isRestart(selection)) {
            initializeGame();
        }
        if (isExit(selection)) {
            gameStatus = GameStatus.EXIT;
        }
    }

    private boolean isRestart(int selection) {
        return selection == 1;
    }

    private boolean isExit(int selection) {
        return selection == 2;
    }
}
