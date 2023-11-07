package HomeWork;

import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {

        System.out.println("enter your garde: ");
        Scanner g=new Scanner(System.in);
        int grade=g.nextInt();
        if (grade<=100 && grade>=90) {
            System.out.println("Your Grade is A");
        }
            else if(grade<=89 && grade>=80) {
            System.out.println("Your Grade is B");
        }
            else if (grade<=79 && grade>=70) {
            System.out.println("Your Grade is C");
        }
            else {
            System.out.println("Your Grade is D");
            }
        }
    }

