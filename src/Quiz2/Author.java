package Quiz2;

public class Author {
    //declaring and Initializing Instance variables
        String firstname="Leo";
        String lastname="William";
   //Instance Methods to print the full name
    public void printInfo(){
        String fullName=firstname+" "+lastname;
        System.out.println("The Full Name of the Author is: "+fullName);
    }

    public static void main(String[] args) {
        Author name=new Author();
        name.printInfo();
    }


}
