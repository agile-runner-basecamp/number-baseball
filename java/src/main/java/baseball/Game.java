package baseball;

import io.InputHandler;
import io.OutputHandler;

import java.util.Scanner;

public class Game {
    private final Judge judge;
    private final RandomGenerator generator;
    private final InputHandler in;
    private final OutputHandler out;

    public Game(Judge judge, RandomGenerator generator,
                InputHandler in, OutputHandler out){
        this.judge = judge;
        this.generator = generator;
        this.in = in;
        this.out = out;
    }

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
        int choice = in.readRestartChoice();
        return choice == 1;
    }

}
