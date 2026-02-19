package baseball;

public class Application {
    public static void main(String[] args) {
        BaseballGame game = new BaseballGame();
        game.play();
        // BaseballGame: 숫자 야구 게임의 전체 흐름을 관리, 재시작 여부를 관리
        // InputView / ResultView: 사용자 입력을 받고 결과 메시지 출력 기능
        // BallNumbers / BallNumber / BallStatus: 각 자리 숫자와 상태(스트라이크/볼/낫싱) 표현과 비교 로직
        // Result: 한 차례 비교의 결과(스트라이크·볼 수)를 보관, 승리 여부를 판단
        // RandomNumbersGenerator: 세 자리 난수를 생성
    }
}
