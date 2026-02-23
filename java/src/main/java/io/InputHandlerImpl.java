package io;

import java.util.Scanner;

public class InputHandlerImpl implements InputHandler {
    private final Scanner scanner = new Scanner(System.in);

    public int inputHandler(){
        while(true){
            if(!scanner.hasNextInt()){
                scanner.next();
                System.out.println("숫자만 입력해주세요.");
                continue;
            }

            int input = scanner.nextInt();

            try{
                validate(input);
                return input;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void validate(int input) {
        if(input < 100 || input > 999){
            throw new IllegalArgumentException("세자리 수를 입력해주세요.");
        }
        int a = input / 100;
        int b = (input / 10) % 10;
        int c = input % 10;

        if(a == b || a == c || b == c){
            throw new IllegalArgumentException("중복되지 않는 숫자를 입력해주세요.");
        }
    }
}
