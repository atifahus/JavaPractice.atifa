package Practice;

public class ReverseLoop {
    public static void main(String[] args) {
/*  Write a program to print all natural numbers in reverse */
        //for loop
        for(int i=10; i>=1;i--){
            System.out.println(i);
        }
        //while loop
        int j =20;
        while(j>=11){
            System.out.println(j);
            j--;
        }
        //do while loop
        int k=30;
        do {
            System.out.println(k);
            k--;
        }
        while (k>=21);
    }
}
