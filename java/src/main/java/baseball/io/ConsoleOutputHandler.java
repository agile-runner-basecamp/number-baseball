package baseball.io;

public class ConsoleOutputHandler implements OutputHandler {
    
    public void printMessage(String message) {
        System.out.println(message);
    }

    public void showMessageForUserInput() {
        System.out.print("숫자를 입력해 주세요 : ");
    }

    public void showRoundResult(int[] result) {
        System.out.print(result[0] + "볼 ");
        System.out.println(result[1] + "스트라이크");
    }

    public void showGameWinningComment() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public void showMessageForNextRound() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}

// 콘솔 기반
// 123
// 451

// 1볼