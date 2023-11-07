package HomeWork;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        String password="abc123";
        int attempts=0;
        String enterPas;

        Scanner p=new Scanner(System.in);
        // 3 attempts to enter password
        do {
            System.out.println("enter password: ");
            enterPas=p.nextLine();
            attempts++;
        }while (!enterPas.equals(password) && attempts<3);

        if(enterPas.equals(password)){
            System.out.println("Successfully Logged in");
        }
        else {
            System.out.println("It is locked.");
        }
    }
}
