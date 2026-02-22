package baseball.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class InputConverterTest {

    @DisplayName("입력받은 문자열을 숫자리스트로 변환할 수 있다.")
    @Test
    void convert() {
        // given
        String userInput = "123";

        InputConverter converter = new InputConverter();

        // when
        List<Integer> result = converter.convert(userInput);

        // then
        assertThat(result).containsExactly(1, 2, 3);
    }

}