package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JudgeTest {
    @DisplayName("볼/스트라이크를 판단하는 테스트 로직입니다.")
    @Test
    void makeCall(){
        // given
        int number = 123;
        int target = 325;

        Judge judge = new Judge();

        // when
        int[] result = judge.makeCall(number, target);

        // then
        assertThat(result).containsExactly(1, 1);
    }
}