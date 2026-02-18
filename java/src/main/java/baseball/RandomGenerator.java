package baseball;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomGenerator {
    public int generate(){
        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();

        while(numbers.size() < 3){
            numbers.add(random.nextInt(9)+1);
        }

        // 세자리 숫자로 생성
        int result = 0;
        for(int n : numbers){
            result = result * 10 + n;
        }

        return result;
    }
}
