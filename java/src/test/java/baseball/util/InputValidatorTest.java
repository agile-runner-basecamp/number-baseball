package baseball.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InputValidatorTest {

    @DisplayName("입력받은 문자열이 세자리 이상일 경우 예외가 발생한다.")
    @Test
    void validateDigitsLength() {
        // given
        String userInput = "1234";

        InputValidator validator = new InputValidator();

        // when & then
        assertThatThrownBy(() -> validator.validateDigits(userInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("숫자는 3자리 수 이상 입력할 수 없습니다.");
    }

    @DisplayName("입력받은 문자열에 중복이 있을 경우 예외가 발생한다.")
    @Test
    void validateDigitsDuplicate() {
        // given
        String userInput = "111";

        InputValidator validator = new InputValidator();

        // when & then
        assertThatThrownBy(() -> validator.validateDigits(userInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("각 자리 숫자는 서로 달라야합니다.");
    }

}