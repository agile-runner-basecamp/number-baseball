package baseball.util;

import java.util.List;

public class InputConverter {
    public List<Integer> convert(String userInput) {
        return userInput.chars()
                .map(Character::getNumericValue)
                .boxed()
                .toList();
    }
}
