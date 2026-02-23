package io;

public class ConsoleOutputHandlerHandler implements OutputHandler {
    public void output(String str){
        System.out.println(str);
        return;
    }

    public void gameStartMessage(){
        System.out.print("숫자를 입력해주세요. : ");
    }

    public void umpireMessage(int ball, int strike, int sum){

        if(sum <= 0) {System.out.println("낫싱");}
        if(ball > 0 && strike > 0) {System.out.printf("%d볼 %d스트라이크\n", ball, strike);}
        if(ball > 0 && strike <= 0) {System.out.printf("%d볼\n", ball); }
        if(ball <= 0 && strike > 0) {System.out.printf("%d스트라이크\n", strike);}
    }

    public void gameCompleteMessage(){
        System.out.print("3 스트라이크\n3개의 숫자를 모두 맞히셨습니다! \n게임 종료\n" +
                "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n");
    }

    @Override
    public void gameEndMessage() {
        System.out.print("게임이 종료되었습니다.");
    }
}
