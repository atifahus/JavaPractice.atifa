import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        //Array
        String[] cityArray= new String[4];
        String[] cityArray2= {"Queens","Brooklyn","Manhattan"};

        //ArrayList
        ArrayList<String> stateArrayList= new ArrayList<>();
        ArrayList<String> stateArrayList2=
                new ArrayList<>(Arrays.asList("NY","NJ","CT"));

        //get the value
        System.out.println(cityArray2[2]);
        System.out.println(stateArrayList2.get(0));

        //get the size
        System.out.println(cityArray.length);
        System.out.println(stateArrayList2.size());

        //add element
        //we can't add value to Array
        stateArrayList2.add("PA");
        System.out.println(stateArrayList2);

        //change element of an index
        cityArray[0]="Hicksville";
        System.out.println(cityArray[0]);
        stateArrayList2.set(3,"VA");
        System.out.println(stateArrayList2);

        //remove
        //we can't remove in array
        stateArrayList2.remove("NJ");
        System.out.println(stateArrayList2);

        //printing
        System.out.println(cityArray2);
        System.out.println(cityArray2[2]); //we have to give index number to print
        System.out.println(stateArrayList2);


    }
}
