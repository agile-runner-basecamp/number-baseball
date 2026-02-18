package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JudgeTest {
    @DisplayName("볼/스트라이크 판단")
    @Test
    void makeCall(){
        // given
        int number = 123;
        int target = 325;

        Judge judge = new Judge();

        // when
        int[] result = judge.makeCall(number, target);

        // then
        Assertions.assertThat(result).containsExactly(new int[]{1, 1});

    }
}