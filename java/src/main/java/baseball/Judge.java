package baseball;

public class Judge {

    public int[] makeCall(int number, int target) {
        int[] numberArr = toDigitList(number);
        int[] targetArr = toDigitList(target);

        int ball = countBall(numberArr, targetArr);
        int strike = countStrike(numberArr, targetArr);

        return new int[]{ball, strike};

    }

    private int countBall(int[] numberArr, int[] targetArr) {
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            ball += checkBall(i, numberArr, targetArr);
        }
        return ball;
    }

    private int checkBall(int i, int[] numberArr, int[] targetArr) {
        if (numberArr[i] == targetArr[i]) {
            return 0;
        }

        for(int j=0; j<3; j++){
            if(i == j) continue;

            if(numberArr[i] == targetArr[j]){
                return 1;
            }
        }
        return 0;
    }

    private int[] toDigitList(int n){
        String s = String.valueOf(n);
        int[] arr = new int[3];

        for(int i=0; i<3; i++){
            arr[i] = s.charAt(i) - '0';
        }
        return arr;
    }

    private int countStrike(int[] numberArr, int[] targetArr){
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            strike += checkStrike(i, numberArr, targetArr);
        }
        return strike;
    }

    private int checkStrike(int i, int[] numberArr, int[] targetArr) {
        if (numberArr[i] == targetArr[i]) {
            return 1;
        }
        return 0;
    }

}
