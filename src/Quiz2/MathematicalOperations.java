package Quiz2;

public class MathematicalOperations {

    public static int sum(int a,int b){
      int sumNumber=a+b;
      return sumNumber;
    }
    public static int multiplication(int a,int b){
        int multi=a*b;
        return multi;
    }
    public static int subtraction(int a,int b){
        int sub=a-b;
        return sub;
    }
    public static int division(int a, int b){
        int div=a/b;
        return div;
    }

    public static void main(String[] args) {
        System.out.println("The Sum of a and b is: "+MathematicalOperations.sum(5,15));
        System.out.println("The Multiplication of a and b is: "+MathematicalOperations.multiplication(3,4));
        System.out.println("The Subtraction of a and b is: "+MathematicalOperations.subtraction(4,8));
        System.out.println("The Division of a and b is: "+MathematicalOperations.division(10,5));
    }
}
