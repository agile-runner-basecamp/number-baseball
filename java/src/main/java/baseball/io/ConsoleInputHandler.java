package baseball.io;

import java.util.Scanner;

public class ConsoleInputHandler implements InputHandler {

    public static final Scanner SCANNER = new Scanner(System.in);

    public int getUserInput() {
        return Integer.parseInt(SCANNER.nextLine());
    }
}
