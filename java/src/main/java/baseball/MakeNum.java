package baseball;

import java.util.HashSet;
import java.util.Random;

public class MakeNum {
    public String make(){
        Random random = new Random();
        HashSet<Integer> set = new HashSet<>();

        while(set.size() < 3){
            set.add(random.nextInt(9)+1);
        }

        String ranNum = "";
        for(Integer n : set){
            ranNum += String.valueOf(n);
        }

        return ranNum;
    }
}
