package baseball.domain;

public class BallNumber {
    private final int position;
    private final int number;

    public BallNumber(int position, int number) {
        this.position = position;
        this.number = number;
    }

    public BallStatus compare(BallNumber other) {
        if (position == other.position && number == other.number) {
            return BallStatus.STRIKE;
        }
        if (number == other.number) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    public int getNumber() {
        return number;
    }
}
