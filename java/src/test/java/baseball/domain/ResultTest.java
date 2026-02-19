package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ResultTest {

    @DisplayName("스트라이크가 3개면 승리로 본다.")
    @Test
    void winCondition() {
        // given
        Result result = new Result(3, 0);

        // when
        boolean win = result.isWin();

        // then
        assertEquals(true, win);
    }

    @DisplayName("볼과 스트라이크가 모두 0이면 낫싱이다.")
    @Test
    void nothing() {
        // given
        Result result = new Result(0, 0);

        // when
        boolean nothing = result.isNothing();

        // then
        assertEquals(true, nothing);
    }

    @DisplayName("볼과 스트라이크를 포맷팅한다.")
    @Test
    void format() {
        // given
        Result result = new Result(1, 2);

        // when
        String message = result.format();

        // then
        assertEquals("2볼 1스트라이크", message);
    }
}
