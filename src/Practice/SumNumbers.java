package Practice;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
     /*   Write a program to find sum of all natural numbers between 1 to n
     * 1+2+3+4+5+6+7+8+9+10
     */
        int sum=0;
        int n=1;
    while (n<=20){
        sum=sum+n;
        n++;

    }
        System.out.println("Sum of all Natuaral Numbers: " + sum);

/* Write a program to find sum of all even numbers between 1 to n */
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Start Number: ");
        int sNum =sc.nextInt();
        System.out.println("Enter End Number: ");
        int eNum=sc.nextInt();
        int evenSum=0;
        for (int i=sNum;i<=eNum;i++){
            if (i%2==0){
                evenSum= evenSum+i;
            }
        }
        System.out.println("Sum of all Even Numbers: "+evenSum);

/*  Write a program to find sum of all odd numbers between 1 to n */
        int odd=1;
        int oddSum=0;
        do {
            if(odd%2 !=0){
                oddSum=oddSum+odd;
            }
            odd++;
        }
        while (odd<=50);

        System.out.println("Sum of all Odd Numbers: "+oddSum);
    }



}
