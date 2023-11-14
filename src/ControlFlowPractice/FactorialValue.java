package ControlFlowPractice;

import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] args) {
        /* Write a program to find the factorial value of any number
         * factorial of 5= 5*4*3*2*1
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int f=1;

        for(int i=1; i<=num;i++){

            f=f*i;
            //   System.out.println(f);
        }
        System.out.println(f);
    }
}
