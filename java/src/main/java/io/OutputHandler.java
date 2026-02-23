package io;

// 출력 메서드 분리
public interface OutputHandler {
    void printInputMessage();
    void printBallStrike(int ball, int strike);
    void printGameClear();
}
