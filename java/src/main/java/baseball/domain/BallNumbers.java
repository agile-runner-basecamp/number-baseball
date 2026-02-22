package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class BallNumbers {
    private static final int NUMBER_SIZE = 3;

    private final List<Integer> numbers;

    private BallNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static BallNumbers from(String input) {
        List<Integer> parsed = new ArrayList<>();
        for (int index = 0; index < NUMBER_SIZE; index++) {
            parsed.add(Character.getNumericValue(input.charAt(index)));
        }
        return new BallNumbers(parsed);
    }

    public static BallNumbers from(List<Integer> rawNumbers) {
        return new BallNumbers(new ArrayList<>(rawNumbers));
    }

    public Result compare(BallNumbers playerNumbers) {
        int strikes = 0;
        int balls = 0;
        for (int index = 0; index < NUMBER_SIZE; index++) {
            int player = playerNumbers.numbers.get(index);
            if (player == numbers.get(index)) {
                strikes++;
                continue;
            }
            if (numbers.contains(player)) {
                balls++;
            }
        }
        return new Result(strikes, balls);
    }
}
