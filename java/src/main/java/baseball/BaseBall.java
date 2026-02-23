package baseball;

import io.ConsoleInputHandlerHandler;
import io.ConsoleOutputHandlerHandler;
import io.OutputHandler;

public class BaseBall {
    public void run(){

        ConsoleInputHandlerHandler consoleInputHandler = new ConsoleInputHandlerHandler();
        ConsoleOutputHandlerHandler consoleOutputHandlerHandler = new ConsoleOutputHandlerHandler();
        MakeNum makeNum = new MakeNum();
        String ranNum = makeNum.make();


        Umpire umpire = new Umpire();

        while(true){
            consoleOutputHandlerHandler. gameStartMessage();
            String userNum = consoleInputHandler.input();

            int strike = umpire.countStrike(ranNum, userNum);
            int ball = umpire.countBall(ranNum, userNum);
            int sum = strike + ball;

            consoleOutputHandlerHandler.umpireMessage(ball, strike, sum);
            if(strike != 3) {continue;}
            consoleOutputHandlerHandler.gameCompleteMessage();


            int reStart = consoleInputHandler.restartInput();
            if(reStart == 1){
                ranNum = makeNum.make();
                continue;
            }

            if(reStart == 2){
                consoleOutputHandlerHandler.gameEndMessage();
                return;
            }


        }

    }
}
