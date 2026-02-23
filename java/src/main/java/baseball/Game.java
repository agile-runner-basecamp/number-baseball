package baseball;

import io.InputHandlerImpl;
import io.OutputHandlerImpl;

public class Game {
    private final Judge judge = new Judge();
    private final RandomGenerator generator = new RandomGenerator();
    private final InputHandlerImpl in = new InputHandlerImpl();
    private final OutputHandlerImpl out = new OutputHandlerImpl();

    public void start(){
        do {
            play();
        }while (restart());
    }

    private void play() {
        int answer = generator.generate();

        boolean finished = false;
        
        while(!finished){
            out.printInputMessage();
            int input = in.inputHandler();
            int[] result = judge.makeCall(input, answer);

            int ball = result[0];
            int strike = result[1];

            out.printBallStrike(ball, strike);

            finished = isThreeStrike(strike);
        }
    }

    private boolean isThreeStrike(int strike) {
        return strike == 3;
    }

    private boolean restart() {
        out.printGameClear();
        int choice = in.inputHandler();
        return choice == 1;
    }

}
