package ControlFlowPractice;

public class PrintAlphabets {
    public static void main(String[] args) {
        /*  Write a program to print all alphabets from a to z */
        for(char x='a';x<='z'; x++){
            System.out.println(x);
        }

        /* Write a program to print reverse alphabets from Z to A */
        char y='z';
        while (y>='a'){
            System.out.println("This is reverse: "+y);
            y--;
        }

    }
}
