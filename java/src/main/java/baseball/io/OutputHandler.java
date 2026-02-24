package baseball.io;

public interface OutputHandler {
    void showMessageForUserInput();

    void showRoundResult(int[] result);

    void showGameWinningComment();

    void showMessageForNextRound();
}
