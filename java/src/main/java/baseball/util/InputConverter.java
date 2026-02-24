package baseball.util;

import java.util.List;

public class InputConverter {
    public List<Integer> convertToDigits(String userInput) {
        return userInput.chars()
                .map(Character::getNumericValue)
                .boxed()
                .toList();
    }

    public int convertToRestartSelection(String userInput) {
        return Integer.parseInt(userInput);
    }
}
