package baseball;

import baseball.io.ConsoleInputHandler;
import baseball.io.ConsoleOutputHandler;
import baseball.io.InputHandler;
import baseball.io.OutputHandler;

public class Baseball {

    public static final InputHandler inputHandler = new ConsoleInputHandler();
    public static final OutputHandler outputHandler = new ConsoleOutputHandler();

    public void run() {
        // 로직


        // 출력 로직
        outputHandler.printMessage("안녕하세요");
    }
}
