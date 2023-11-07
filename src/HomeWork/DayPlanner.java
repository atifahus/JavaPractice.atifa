package HomeWork;

import java.util.Scanner;

public class DayPlanner {
    /*Declare day plan using switch case */
    public static void main(String[] args) {
        System.out.println("Enter a day: ");
        Scanner d= new Scanner(System.in);
        String day= d.nextLine();
        switch (day){
            case "monday":
                System.out.println("It is a work day");
                break;
            case "tuesday":
                System.out.println("I have doctor's appointment");
                break;
            case "wednesday":
                System.out.println("I have an assignment due");
                break;
            case "thursday":
                System.out.println("Can't wait for weekend");
                break;
            case "friday":
                System.out.println("It's almost weekend");
                break;
            case "saturday":
                System.out.println("Today is picnic");
                break;
            case  "sunday" :
                System.out.println("Sunday is funday");
                break;
            default:
                System.out.println("Invalid day. Try again");
        }


    }
}
