package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BallNumberTest {

    @DisplayName("같은 자리 같은 숫자면 스트라이크다.")
    @Test
    void strike() {
        // given
        BallNumber computer = new BallNumber(0, 1);
        BallNumber player = new BallNumber(0, 1);

        // when
        BallStatus status = computer.compare(player);

        // then
        assertEquals(BallStatus.STRIKE, status);
    }

    @DisplayName("숫자만 같고 자리가 다르면 볼이다.")
    @Test
    void ball() {
        // given
        BallNumber computer = new BallNumber(0, 3);
        BallNumber player = new BallNumber(1, 3);

        // when
        BallStatus status = computer.compare(player);

        // then
        assertEquals(BallStatus.BALL, status);
    }

    @DisplayName("자리도 숫자도 다르면 낫싱이다.")
    @Test
    void nothing() {
        // given
        BallNumber computer = new BallNumber(0, 5);
        BallNumber player = new BallNumber(1, 7);

        // when
        BallStatus status = computer.compare(player);

        // then
        assertEquals(BallStatus.NOTHING, status);
    }
}
