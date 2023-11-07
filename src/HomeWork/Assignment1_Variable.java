package HomeWork;

public class Assignment1_Variable {

    public static void main(String[] args) {

        /* Initiate and declare Primitive data type  */
        int streetNumber = 111;         //Integer data type
        double distanceInMiles = 4.6;   //decimal data type
        Boolean hasApartment=true;      // Boolean - true, false
        char aptNumber = 'C';           //single character

        /* Initiate and declare non-primitive data type */
        String cityName= "abc";

        //using a String concatenation to print
        System.out.println("What is street number? "+streetNumber);
        System.out.println("What is the distance from here? "+ distanceInMiles);
        System.out.println("Does it have Apartment? "+hasApartment);
        System.out.println("What is the Apartment number?"+aptNumber);
        System.out.println("Tell me the full address :"+ streetNumber+ " " +cityName);


    }
}
