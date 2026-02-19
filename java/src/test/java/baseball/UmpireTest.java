package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UmpireTest {

    @DisplayName("각 자리수가 정답과 서로 같은지 확인할 수 있다.")
    @Test
    void makeCall() {
        // given (재료 준비)
        int numbers = 123;
        int target = 145;

        Umpire umpire = new Umpire();

        // when (검증 대상)
        int[] result = umpire.makeCall(numbers, target);

        // then (예상 결과)
        assertThat(result).containsExactly(new int[]{0, 1});
    }

}