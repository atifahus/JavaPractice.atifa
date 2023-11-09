package Practice;

public class EvenNumbers {
    public static void main(String[] args) {
/*   Write a program to print all even numbers between 1 to 100 */
        int num=1;
    //do while loop
        do {
            if (num%2==0){
                System.out.println(num);
            }
            num++;
        }
        while (num<=100);

    //for loop
        for (int n=1;n<=100;n++){
            if (n%2==0) {
                System.out.println("Even numbers: "+n);
            }
        }
    }

}
