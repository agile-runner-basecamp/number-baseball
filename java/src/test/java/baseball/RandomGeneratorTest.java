package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomGeneratorTest {
    @DisplayName("난수가 정상적으로 생성되었는지 조건을 검증하는 테스트")
    @Test
    void generate (){
        // given
        RandomGenerator random = new RandomGenerator();

        // when
        int result = random.generate();

        // then
        assertTrue(result >= 100 && result <= 999);
    }
}