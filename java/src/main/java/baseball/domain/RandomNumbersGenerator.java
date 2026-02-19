package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbersGenerator {
    private static final int NUMBER_SIZE = 3;

    public List<Integer> generate() {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        while (numbers.size() < NUMBER_SIZE) {
            int value = random.nextInt(9) + 1;
            if (!numbers.contains(value)) {
                numbers.add(value);
            }
        }
        return numbers;
    }
}
