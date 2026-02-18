package baseball;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws Exception{
        // TODO: 프로그램 구현
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MakeNum makeNum = new MakeNum();
        String ranNum = makeNum.make();


        Calculator calculator = new Calculator();

        while(true){
            System.out.print("숫자를 입력해주세요. :");
            String userNum = br.readLine();

            int strike = calculator.countStrike(ranNum, userNum);
            int ball = calculator.countBall(ranNum, userNum);
            int sum = strike + ball;
            if(sum <= 0) {System.out.println("낫싱");}
            if(ball > 0 && strike > 0) {System.out.printf("%d볼 %d스트라이크\n", ball, strike);}
            if(ball > 0 && strike <= 0) {System.out.printf("%d볼\n", ball); }
            if(ball <= 0 && strike > 0) {System.out.printf("%d스트라이크\n", strike);}
            if(strike != 3) {continue;}

            System.out.printf("%d스트라이크\n3개의 숫자를 모두 맞히셨습니다! \n게임 종료\n" +
                        "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n", strike);

            int reStart = Integer.parseInt(br.readLine());
            if(reStart == 1){
                ranNum = makeNum.make();
                continue;
            }

            if(reStart == 2){
                System.out.print("게임이 종료되었습니다.");
                return;
            }


        }




    }
}
