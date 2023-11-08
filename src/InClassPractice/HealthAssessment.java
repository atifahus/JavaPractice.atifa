package InClassPractice;

import java.util.Scanner;

public class HealthAssessment {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
       System.out.println("Please Enter Your Age: ");
       int age= s.nextInt();
    if(age<18 || age>=65){
        System.out.println("Congratulation! You are eligible.");
        }
    else {
        System.out.println("Sorry you are not eligible.");
    }
    }
}
