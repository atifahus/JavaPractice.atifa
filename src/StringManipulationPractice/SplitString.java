package StringManipulationPractice;

public class SplitString {
    /* split value will always return in String Array
     * we store Split value in String Array
     * To print array, we use loop
     * */

    public static void main(String[] args) {
        String str="This_is_Hello_World";

            String[] SplitStr = (str.split("_"));
            for (int i =0; i < SplitStr.length; i++) {
                System.out.println(SplitStr[i]);
            }
    }
}
