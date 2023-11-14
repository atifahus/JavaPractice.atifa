package Quiz2;

public class Employee {
    //declaring and Initializing Instance variables
    String firstName="Lisa";
    String lastName="brown";
    float salary=6000.78f;
    int phoneNumber=1236527539;
    int age=30;
    //Instance method to print Employee's details
    public void printInfo(){
        System.out.println("Below is the Employee's Information");
        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Employee's Salary: "+salary);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Age: "+age);
    }
    //Instance method to calculate the bonus salary
    public float calculateBonus(float bonus){
        float monthlySalary=salary+(salary*bonus);
        return monthlySalary;
    }

    public static void main(String[] args) {
        Employee emp= new Employee();
        emp.printInfo();
        System.out.println("The monthly salary after adding 5% bonus is: "+emp.calculateBonus(0.05f));
    }

}
