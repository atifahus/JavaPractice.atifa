package Practice;

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
        System.out.println(sum);
    }
}
