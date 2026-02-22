package baseball.util;

import java.util.List;
import java.util.Random;

public class RandomNumbersGenerator {

    private static final Random RANDOM = new Random();

    public List<Integer> generate() {
        return RANDOM.ints(1, 10)
                .distinct()
                .limit(3)
                .boxed()
                .toList();
    }
}
