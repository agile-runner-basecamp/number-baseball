package baseball;

public class Calculator {
    public int countStrike(String ranNum, String playNum) {
        int strike = 0;
        for (int i = 0; i < ranNum.length(); i++) {
            strike += checkStrike(ranNum.charAt(i),playNum.charAt(i));
        }
        return strike;
    }

    public int countBall(String ranNum, String playNum) {
        int ball = 0;
        for (int i = 0; i < ranNum.length(); i++) {
            ball += checkBall(ranNum, playNum, i);
        }
        return ball;
    }
    public int checkStrike(char ranNum, char playNum){
        int check = 0;
        if(ranNum == playNum) {
            check = 1;
        }
        return check;
    }

    public int checkBall(String ranNum, String playNum, int i){
        int check = 0;
        if((ranNum.charAt(i) != playNum.charAt(i)) && ranNum.contains(String.valueOf(playNum.charAt(i)))) {
            check = 1;
        }
        return check;
    }
}




