package StringManipulationPractice;

import java.util.Scanner;

public class CompareEndString {
    public static void main(String[] args) {
        /*Write a Java program to concatenate a given string to the end of another string*/
        String str = "a";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a car name: ");
        String carName = sc.nextLine();
        if (carName.endsWith(str)) {
            System.out.println("It ends with given end String");
        } else {
            System.out.println("Try again. It doesn't end with given String");

        }
        /*Write a Java program to test if a given string contains the specified sequence of char values*/
        System.out.println("Enter a model name: ");
        String s=sc.nextLine();
        if (carName.contains(str)){
            System.out.println("Given string contains the specified  values");
        }
        else {
            System.out.println("Try Again. String doesn't contain Specific value");
        }
    }
    }

