package baseball;

import baseball.util.RandomNumbersGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RandomNumbersGeneratorTest {

    @DisplayName("랜덤으로 생성된 숫자는 정확히 3자리다.")
    @Test
    void generateSize() {
        // given
        RandomNumbersGenerator generator = new RandomNumbersGenerator();

        // when
        List<Integer> randoms = generator.generate();

        // then
        assertThat(randoms).hasSize(3);
    }

    @DisplayName("랜덤으로 생성된 숫자는 서로 중복되지 않아야 한다.")
    @Test
    void generateDistinct() {
        // given
        RandomNumbersGenerator generator = new RandomNumbersGenerator();

        // when
        List<Integer> randoms = generator.generate();

        // then
        assertThat(randoms).doesNotHaveDuplicates();
    }

}