package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @DisplayName("계산기로 덧셈을 수행할 수 있다.")
    @Test
    void calculator_sum() {
        // given
        // 재료 준비


        Calculator calculator = new Calculator();



        // when
        // 검증하고 싶은 메서드
        int result = calculator.checkBall("321","123", 2);


//        describe('calculator', () => {
//            // given
//                it ('계산기로 덧셈을 수행할 수 있다.', () => {
//                   expect();
//                });
//        })

        // then
        // 예상 결과
        assertThat(result).isEqualTo(1);
    }
}
