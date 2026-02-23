package io;

import java.util.Scanner;

public class InputHandlerImpl implements InputHandler {
    private final Scanner scanner = new Scanner(System.in);

    public int inputHandler(){
        return scanner.nextInt();
    }
}
