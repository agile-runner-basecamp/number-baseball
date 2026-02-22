package baseball.io;

public class ConsoleOutputHandler implements OutputHandler {

    @Override
    public void showMessageForUserInput() {
        System.out.print("숫자를 입력해 주세요 : ");
    }

    @Override
    public void showRoundResult(int[] result) {
        if (result[0] != 0 && result[1] != 0) {
            System.out.println(result[0] + "볼 " + result[1] + "스트라이크");
            return;
        }
        if (result[0] != 0) {
            System.out.println(result[0] + "볼 ");
            return;
        }
        if (result[1] != 0) {
            System.out.println(result[1] + "스트라이크");
            return;
        }
        System.out.println("낫싱");
    }

    @Override
    public void showGameWinningComment() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    @Override
    public void showMessageForNextRound() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}