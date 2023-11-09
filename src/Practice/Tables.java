package Practice;

public class Tables {
   /* Write a program to print tables */
   public static void main(String[] args) {
       int start=1;
       int num=5;
       //do while loop
       do {
           System.out.println(start*num);
           start++;
       }
       while ( start<=10);

       //for loop
       for(int i=1;i<=10;i++){
           System.out.println("This is a table of 5: "+i*num);
   }


    }


}
