package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ApplicationTest {

    // TODO: 테스트 코드 작성
    // test + Tab → 자동완성 (IntelliJ Live Template 설정 필요)

    @DisplayName("스트라이크와 볼 개수 판정 테스트")
    @Test
    void scoreTest() {
        // given
        Referee referee = new Referee();
        List<Integer> computer = List.of(1, 2, 3);
        List<Integer> user = List.of(1, 3, 5);

        // when
        int strikes = referee.countStrike(computer, user);
        int balls = referee.countBall(computer, user);

        // then
        assertThat(strikes).isEqualTo(1);
        assertThat(balls).isEqualTo(1);
    }

    @DisplayName("입력값이 3자리가 아니면 에러 발생")
    @Test
    void validateTest() {
        // given & when & then
        assertThatThrownBy(() -> {
            Application.validateInput("12");
        })
                .isInstanceOf(IllegalArgumentException.class);
    }

}
