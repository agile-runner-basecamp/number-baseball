package baseball;

import java.util.List;

public class Referee {
    public int countStrike(List<Integer> computer, List<Integer> user) {
        int strikes = 0;
        for (int i = 0; i < 3; i++) {
            strikes += Strike(computer, user, i);
        }
        return strikes;
    }

    private int Strike(List<Integer> computer, List<Integer> user, int index) {
        if (computer.get(index).equals(user.get(index))) {
            return 1;
        }
        return 0;
    }

    public int countBall(List<Integer> computer, List<Integer> user) {
        int balls = 0;
        for (int i = 0; i < 3; i++) {
            balls += isBall(computer, user, i);
        }
        return balls;
    }

    private int isBall(List<Integer> computer, List<Integer> user, int index) {
        if (computer.get(index).equals(user.get(index))) {
            return 0;
        }
        if (computer.contains(user.get(index))) {
            return 1;
        }
        return 0;
    }
}