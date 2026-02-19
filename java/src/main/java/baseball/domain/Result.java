package baseball.domain;

public class Result {
    private static final int WIN_STRIKE_COUNT = 3;

    private final int strikeCount;
    private final int ballCount;

    public Result(int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public static Result empty() {
        return new Result(0, 0);
    }

    public int strikeCount() {
        return strikeCount;
    }

    public int ballCount() {
        return ballCount;
    }

    public boolean isNothing() {
        return strikeCount == 0 && ballCount == 0;
    }

    public boolean isWin() {
        return strikeCount == WIN_STRIKE_COUNT;
    }

    public String format() {
        if (isNothing()) {
            return "낫싱";
        }
        StringBuilder builder = new StringBuilder();
        appendBalls(builder);
        appendStrikes(builder);
        return builder.toString().trim();
    }

    private void appendBalls(StringBuilder builder) {
        if (ballCount == 0) {
            return;
        }
        builder.append(ballCount).append("볼 ");
    }

    private void appendStrikes(StringBuilder builder) {
        if (strikeCount == 0) {
            return;
        }
        builder.append(strikeCount).append("스트라이크");
    }
}
