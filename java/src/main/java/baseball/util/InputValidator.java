package baseball.util;

public class InputValidator {
    public void validateDigits(String userInput) {
        for (char ch : userInput.toCharArray()) {
            if (!Character.isDigit(ch)) {
                throw new IllegalArgumentException("숫자만 입력 가능합니다.");
            }
        }

        if (userInput.length() != 3) {
            throw new IllegalArgumentException("숫자는 3자리 수 이상 입력할 수 없습니다.");
        }

        long uniqueLength = userInput.chars().distinct().count();
        if (uniqueLength != userInput.length()) {
            throw new IllegalArgumentException("각 자리 숫자는 서로 달라야합니다.");
        }
    }

    public void validateRestartSelection(String userInput) {
        for (char ch : userInput.toCharArray()) {
            if (!Character.isDigit(ch)) {
                throw new IllegalArgumentException("숫자만 입력 가능합니다.");
            }
        }

        int num = Integer.parseInt(userInput);
        if (num < 1 || 2 < num) {
            throw new IllegalArgumentException("숫자는 1 혹은 2만 입력 가능합니다.");
        }
    }
}
