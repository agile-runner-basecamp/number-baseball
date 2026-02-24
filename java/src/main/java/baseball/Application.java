package baseball;

import baseball.io.ConsoleInputHandler;
import baseball.io.ConsoleOutputHandler;
import baseball.io.InputHandler;
import baseball.io.OutputHandler;
import baseball.util.InputConverter;
import baseball.util.InputValidator;
import baseball.util.RandomNumbersGenerator;

public class Application {
    public static void main(String[] args) {
        InputHandler inputHandler = new ConsoleInputHandler();
        OutputHandler outputHandler = new ConsoleOutputHandler();

        Umpire umpire = new Umpire();
        RandomNumbersGenerator generator = new RandomNumbersGenerator();

        Baseball baseball = new Baseball(inputHandler, outputHandler, umpire, generator);
        baseball.run();
    }
}
