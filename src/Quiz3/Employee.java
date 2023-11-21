package Quiz3;

public class Employee {
    private String firstName;
    private String lastName;
    private String designation;
    private String employeeEmail;
    private int employeeId;
    private float salary;
/*setter and getter methods for all variables
 ( Designation can be manager or developer if entered other than this print error message)*/
    private String getDesignation(){
        return designation;
    }

    private void setDesignation(String newDesignation){

        if(newDesignation.equalsIgnoreCase("Manager") || newDesignation.equalsIgnoreCase("Developer")){
            this.designation = newDesignation;
        }
        else {
            System.out.println("Please try different designation");
        }
    }

//parametrized constructor
    public Employee(String fName, String lName, String email, int id){
        firstName= fName;
        lastName=lName;
        employeeEmail=email;
        employeeId=id;

    }

    private String getFirstName(){
        return firstName;
    }
    private String getLastName(){
        return lastName;
    }
    private String getEmail(){
        return employeeEmail;
    }
    private int getId(){
        return employeeId;
    }

    /*resetSalary: if the designation is manager then salary is 3000
    and if the designation is developer salary is 3400*/
    private float calculateSalary(){

        if (designation.equalsIgnoreCase("Manager")){
            salary=3000.00f;
        }
        else if(designation.equalsIgnoreCase("Developer")){
            salary=3400.00f;
        }
        else {
            System.out.println("Enter valid entry");
        }
        return salary;
    }

    public static void main(String[] args) {
        Employee emp=new Employee("Jack","Son","jackson123@gmail.com",9485);

        System.out.println("Employee Details:");
        System.out.println("First Name- "+emp.getFirstName());
        System.out.println("Last Name- "+emp.getLastName());
        System.out.println("Email- "+emp.getEmail());
        System.out.println("Employee ID- "+emp.getId());

        emp.setDesignation("Developer");
        System.out.println("Designation- "+emp.getDesignation());

        System.out.println("Salary- "+emp.calculateSalary());



    }


}
