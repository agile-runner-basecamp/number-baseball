package baseball;

import java.util.List;
import java.util.stream.IntStream;

public class Umpire {

    public int[] makeCall(List<Integer> userInput, List<Integer> target) {
        int strike = (int) IntStream.range(0, 3)
                .filter(index -> userInput.get(index).equals(target.get(index)))
                .count();

        int ball = (int) IntStream.range(0, 3)
                .filter(index -> target.contains(userInput.get(index)))
                .filter(index -> !userInput.get(index).equals(target.get(index)))
                .count();

        return new int[]{ball, strike};
    }

}
