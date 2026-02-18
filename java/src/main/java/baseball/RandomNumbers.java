package baseball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomNumbers {
    private final List<Integer> numbers;

    public RandomNumbers() {
        this.numbers = generate();
    }

    private List<Integer> generate() {
        List<Integer> digits = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            digits.add(i);
        }
        Collections.shuffle(digits);
        return new ArrayList<>(digits.subList(0, 3));
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}