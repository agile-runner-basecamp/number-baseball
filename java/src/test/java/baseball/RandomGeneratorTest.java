package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomGeneratorTest {
    @DisplayName("난수 생성")
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