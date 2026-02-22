package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BallNumbersTest {

    @DisplayName("컴퓨터 숫자와 비교해 스트라이크 개수를 센다.")
    @Test
    void countStrikes() {
        // given
        BallNumbers computer = BallNumbers.from("123");
        BallNumbers player = BallNumbers.from("129");

        // when
        Result result = computer.compare(player);

        // then
        assertEquals(2, result.strikeCount());
    }

    @DisplayName("컴퓨터 숫자와 비교해 볼 개수를 센다.")
    @Test
    void countBalls() {
        // given
        BallNumbers computer = BallNumbers.from("123");
        BallNumbers player = BallNumbers.from("234");

        // when
        Result result = computer.compare(player);

        // then
        assertEquals(2, result.ballCount());
    }

    @DisplayName("겹치는 숫자가 없으면 낫싱이다.")
    @Test
    void nothing() {
        // given
        BallNumbers computer = BallNumbers.from("123");
        BallNumbers player = BallNumbers.from("456");

        // when
        Result result = computer.compare(player);

        // then
        assertEquals(true, result.isNothing());
    }
}
