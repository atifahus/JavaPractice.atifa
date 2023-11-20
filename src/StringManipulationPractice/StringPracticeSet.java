package StringManipulationPractice;

import java.util.Scanner;

public class StringPracticeSet {
    public static void main(String[] args) {

        /*Write a Java program to concatenate Two strings*/
        String str1="Today weather is sunny.";
        String str2= "Tomorrow it will rain";
        String strConcat= str1.concat(str2);
        System.out.println("Concatenate Two strings: "+ strConcat);

        /*Write a Java program to get the character (Unicode code point)
        at the given index within the String*/
        String fruit="Apple";
        for (int i=0; i<fruit.length();i++) {
            System.out.println("The unicode of "+ fruit.charAt(i)+" is: "+ fruit.codePointAt(i));
        }

        /*Write a Java program to count a number of Unicode code points
        in the specified text range of a String*/
        System.out.println(fruit.codePointCount(0,fruit.length()));


    }


}

