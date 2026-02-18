package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class UmpireTest {

    @DisplayName("입력받은 숫자와 정답을 비고해 스트라이크와 볼 개수를 구할 수 있다.")
    @Test
    void makeCall() {
        // given
        List<Integer> numbers = List.of(1, 2, 3);
        List<Integer> target = List.of(1, 4, 5);

        Umpire umpire = new Umpire();

        // when
        int[] result = umpire.makeCall(numbers, target);

        // then
        assertThat(result).containsExactly(0, 1);
    }

    @DisplayName("입력받은 숫자와 정답의 위치와 숫자가 모두 다를 경우 낫싱이다.")
    @Test
    void makeCallNothing() {
        // given
        List<Integer> numbers = List.of(1, 2, 3);
        List<Integer> target = List.of(4, 5, 6);

        Umpire umpire = new Umpire();

        // when
        int[] result = umpire.makeCall(numbers, target);

        // then
        assertThat(result).containsExactly(0, 0);
    }

    @DisplayName("입력받은 숫자와 정답의 위치와 숫자가 모두 동일한 경우 3스트라이크다.")
    @Test
    void makeCallThreeStrikes() {
        // given
        List<Integer> numbers = List.of(1, 2, 3);
        List<Integer> target = List.of(1, 2, 3);

        Umpire umpire = new Umpire();

        // when
        int[] result = umpire.makeCall(numbers, target);

        // then
        assertThat(result).containsExactly(0, 3);
    }

    @DisplayName("입력받은 숫자와 정답의 위치가 다르고 숫자는 일치할 경우 3볼이다.")
    @Test
    void makeCallThreeBalls() {
        // given
        List<Integer> numbers = List.of(1, 2, 3);
        List<Integer> target = List.of(2, 3, 1);

        Umpire umpire = new Umpire();

        // when
        int[] result = umpire.makeCall(numbers, target);

        // then
        assertThat(result).containsExactly(3, 0);
    }

}