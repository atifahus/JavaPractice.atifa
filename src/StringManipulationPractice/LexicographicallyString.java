package StringManipulationPractice;
/*Write a Java program to compare two strings lexicographically
        Two strings are lexicographically equal if they are the same length
        and contain the same characters in the same positions*/

public class LexicographicallyString {
    public static void main(String[] args) {
        String str1="Hello World";
        String str2="Hello World!";

        if(str1.compareTo(str2)==0){
            System.out.println("Two strings are lexicographically equal");
        }
        else {
            System.out.println("Two strings are not lexicographically equal");
        }

        /*Write a Java program to compare two strings lexicographically,
         ignoring case differences*/
        String s1="It is Sunny";
        String s2="it is sunny";
        if (s1.compareToIgnoreCase(s2)==0){
            System.out.println("Two strings are lexicographically equal");
        }
        else {
            System.out.println("Two strings are not lexicographically equal");
        }
    }
}
