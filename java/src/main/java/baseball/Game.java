package baseball;

import java.util.Scanner;

public class Game {
    private final Scanner scanner = new Scanner(System.in);
    private final Judge judge = new Judge();
    private final RandomGenerator generator = new RandomGenerator();

    public void start(){
        while(true){
            play();
            if(!restart()){
                break;
            }
        }
    }

    private void play() {
        int answer = generator.generate();

        boolean finished = false;
        
        while(!finished){
            System.out.print("숫자를 입력해 주세요 : ");
            int input = scanner.nextInt();
            int[] result = judge.makeCall(input, answer);

            int ball = result[0];
            int strike = result[1];

            System.out.printf("%d볼 %d스트라이크\n", ball, strike);

            finished = isThreeStrike(strike);
        }

    }

    private boolean isThreeStrike(int strike) {
        return strike == 3;
    }

    private boolean restart() {
//        System.out.println("continue: 1, exit: 2");
        System.out.println("게임을 계속 시작하려면 1, 종료하려면 2를 입력하세요.");
        int choice = scanner.nextInt();
        return choice == 1;
    }

}
