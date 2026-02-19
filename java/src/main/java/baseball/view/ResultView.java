package baseball.view;

import baseball.domain.Result;

public class ResultView {
    private ResultView() {
    }

    public static void printResult(Result result) {
        System.out.println(result.format());
    }

    public static void printGameEnd() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
