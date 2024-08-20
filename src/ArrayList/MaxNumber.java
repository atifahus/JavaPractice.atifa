package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MaxNumber {

    //Return the max value of the ArrayList
    public static void main(String[] args) {
        ArrayList<Integer> num= new ArrayList<>(Arrays.asList(1,3,6,2,8,5));


      Integer maxNum=  Collections.max(num);
        System.out.println(maxNum);
    }
}
