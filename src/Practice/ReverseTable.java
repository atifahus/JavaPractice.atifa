package Practice;

public class ReverseTable {
    public static void main(String[] args) {
        int num=3;
        int j=10;
     /*   Write a program to print reverse tables */
        //for loop
       for (int i=10; i>=1;i--) {
           System.out.println(i * num);
       }
       while (j>=1){
           System.out.println(j*num);
           j--;
       }
    }

}
