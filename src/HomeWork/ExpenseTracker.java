package HomeWork;

public class ExpenseTracker {


    public static void main(String[] args) {
        double rent= 2000.34;
        double groceries=500.34;
        double entertainment=70.44;
        double transportation=2001.34;

        if(rent>groceries && rent> entertainment && rent>transportation ){
            System.out.println("Rent expense is the highest");
        }
        else if (groceries> rent && groceries>entertainment && groceries >transportation){
            System.out.println("Groceries expense is the highest");
        }
        else if(entertainment>rent && entertainment>groceries && entertainment>transportation){
            System.out.println("Entertainment expense is the highest");
        }
        else {
            System.out.println("Transportation expense is the highest");
        }
    }
}
