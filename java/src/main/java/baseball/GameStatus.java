package baseball;

public enum GameStatus {
    PLAYING("진행중"),
    WINNING("라운드 승리"),
    EXIT("게임 종료");

    private String description;

    GameStatus(String description) {
        this.description = description;
    }

    public boolean isRunning() {
        return this != EXIT;
    }

    public boolean isWinning() {
        return this == WINNING;
    }

    public boolean isPlaying() {
        return this == PLAYING;
    }
}
