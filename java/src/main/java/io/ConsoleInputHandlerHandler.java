package io;

import java.util.Scanner;

public class ConsoleInputHandlerHandler implements InputHandler {
    public static final Scanner SCANNER = new Scanner(System.in);

    public String input(){
        String num = SCANNER.next();
        return num;
    }

    public int restartInput(){
        int num = Integer.parseInt(SCANNER.next());
        return num;
    }

}
