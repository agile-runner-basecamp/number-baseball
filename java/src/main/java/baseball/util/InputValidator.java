package baseball.util;

public class InputValidator {
    public void validate(String userInput) {
        if (userInput.length() != 3) {
            throw new IllegalArgumentException("숫자는 3자리 수 이상 입력할 수 없습니다.");
        }

        long uniqueLength = userInput.chars().distinct().count();
        if (uniqueLength != userInput.length()) {
            throw new IllegalArgumentException("각 자리 숫자는 서로 달라야합니다.");
        }
    }
}
