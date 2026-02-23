package baseball;

import io.InputHandlerImpl;
import io.OutputHandlerImpl;

import java.util.Scanner;

public class Game {
    private final Judge judge;
    private final RandomGenerator generator;
    private final InputHandlerImpl in;
    private final OutputHandlerImpl out;
    private final Scanner scanner = new Scanner(System.in);

    public Game(Judge judge, RandomGenerator generator,
                InputHandlerImpl in, OutputHandlerImpl out){
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
        int choice = scanner.nextInt();
        return choice == 1;
    }

}
