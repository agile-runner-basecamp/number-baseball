package io;

public interface OutputHandler {
    public void output(String str);
    public void gameStartMessage();
    public void umpireMessage(int ball, int strike, int sum);
    public void gameCompleteMessage();
    public void gameEndMessage();
}
