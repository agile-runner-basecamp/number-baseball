package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RandomNumbersGeneratorTest {

    @DisplayName("서로 다른 세 자리 숫자를 생성한다.")
    @Test
    void generateUniqueNumbers() {
        // given
        RandomNumbersGenerator generator = new RandomNumbersGenerator();

        // when
        List<Integer> numbers = generator.generate();

        // then
        Set<Integer> unique = numbers.stream().collect(Collectors.toSet());
        assertEquals(3, unique.size());
    }

    @DisplayName("생성된 숫자는 1부터 9 사이다.")
    @Test
    void generateNumbersInRange() {
        // given
        RandomNumbersGenerator generator = new RandomNumbersGenerator();

        // when
        List<Integer> numbers = generator.generate();

        // then
        assertTrue(numbers.stream().allMatch(number -> number >= 1 && number <= 9));
    }

    @DisplayName("세 개의 숫자를 생성한다.")
    @Test
    void generateSize() {
        // given
        RandomNumbersGenerator generator = new RandomNumbersGenerator();

        // when
        List<Integer> numbers = generator.generate();

        // then
        assertEquals(3, numbers.size());
    }
}
