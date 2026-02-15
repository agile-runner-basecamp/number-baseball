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
        int a = 1;
        int b = 2;

        Calculator calculator = new Calculator();

//        const a: number = 1;
//        const b: number = 2;

        // when
        // 검증하고 싶은 메서드
        int result = calculator.sum(a, b);


//        describe('calculator', () => {
//            // given
//                it ('계산기로 덧셈을 수행할 수 있다.', () => {
//                   expect();
//                });
//        })

        // then
        // 예상 결과
        assertThat(result).isEqualTo(3);
    }
}
