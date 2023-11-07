package HomeWork;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        String password="abc123";
        int attemps=0;
        String enterPas;

        Scanner p=new Scanner(System.in);

        do {
            System.out.println("enter password: ");
            enterPas=p.nextLine();
            attemps++;
        }while (!enterPas.equals(password) && attemps<3);

        if(enterPas.equals(password)){
            System.out.println("Successfully Logged in");
        }
        else {
            System.out.println("It is locked.");
        }
    }
}
