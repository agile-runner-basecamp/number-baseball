package baseball.io;

import baseball.util.InputConverter;
import baseball.util.InputValidator;

import java.util.List;
import java.util.Scanner;

public class ConsoleInputHandler implements InputHandler {

    private static final Scanner SCANNER = new Scanner(System.in);

    private final InputValidator validator = new InputValidator();
    private final InputConverter converter = new InputConverter();

    @Override
    public List<Integer> getDigits() {
        String line = SCANNER.nextLine();
        validator.validateDigits(line);
        return converter.convertToDigits(line);
    }

    @Override
    public int getRestartSelection() {
        String line = SCANNER.nextLine();
        validator.validateRestartSelection(line);
        return converter.convertToRestartSelection(line);
    }
}