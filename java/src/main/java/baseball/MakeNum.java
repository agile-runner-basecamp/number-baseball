package baseball;

import java.util.Random;

public class MakeNum {
    public String make(){
        Random random = new Random();
        int createNum = 0;
        String ranNum = "";
        int letter = 3;
        String resultNum = "";

        for(int i = 0; i < letter; i++){
            createNum = random.nextInt(9);
            ranNum = Integer.toString(createNum);
            resultNum += ranNum;
        }
        return resultNum;
    }
}
