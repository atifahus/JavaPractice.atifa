package HomeWork;

import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args) {

        System.out.println("enter your marks: ");
        Scanner m=new Scanner(System.in);
        int marks =m.nextInt();
        if (marks<=100 && marks>=90) {
            System.out.println("Your Grade is A");
        }
            else if(marks<=89 && marks>=80) {
            System.out.println("Your Grade is B");
        }
            else if (marks<=79 && marks>=70) {
            System.out.println("Your Grade is C");
        }
            else {
            System.out.println("Your Grade is D");
            }
        }
    }

