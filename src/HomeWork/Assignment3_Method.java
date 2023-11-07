package HomeWork;

public class Assignment3_Method {
    /* This is an assignment to declare methods */
//1.Book
    String title, author, genre;
    int ISBN, pageCount;

    public void read() {
    }
    public void bookmarkPage(int page){
    }
    public void review(){
    }
//2.Smartphone
    String brand, model;
    double batteryPercentage, storageSpace;
    public void makeCall(String number){

    }
    public String installApp(String appName){
        return appName;
    }
    public void charge(){

    }
//3.BankAccount
    String accountHolderName, accountType;
    double balance;
    int accountNumber;
    public double deposit (double amount){
        return amount;
    }
    public void withdraw(double amount){

    }
    public void checkBalance(){

    }
//4.MusicTrack
    String trackName, artist;
    double duration;
    public void play(){}
    public void pause(){}
    public void stop(){}

//5.recipe
    String recipeName, ingredients;
    int steps;
    double servingSize;
    public void cook(){}
    public void serve(){}
    public void storeLeftovers(){}

//6.Product
    String productName;
    double price, quantityInStock;
    int productID;
    public void purchase(){}
    public int restock(int quantity){
        return quantity;
    }
    public void applyDiscount(double percentage){}

//7.Aircraft
    String aircraftType;
    double maxAltitude, currentAltitude;
    int speed;
    public void takeOff(){}
    public void land(){}
    public int adjustAltitude(int newAltitude){
        return newAltitude;
    }

//8.Student
    String studentName, gradeLevel, majorSubject;
    int studentID;
    public void study(){}
    public void takeExam(){}
    public void registerForCourse(String courseName){}

//9.TVShow
    String showName;
    int numberOfSeasons, currentEpisode;
    public void watch(){}
    public void skipEpisode(){}
    public void rate(){}

//10.Plant
    String species, color;
    double height, sunlightRequirement;
    public void water(){}
    public void prune(){}
    public void repot(){}

//11.ShoppingCart
    String items;
    double totalCost;
    int numberOfItems;
    public String addItem(String item){
        return item;
    }
    public String removeItem(String item){
        return item;
    }
    public void checkout(){}

//12.GamingConsole
    String consoleBrand, gameCollection;
    int StorageSize;
    public String playGame(String gameName){
        return gameName;
    }
    public void updateSoftware(){}
    public void reset(){}

//13.Ticket
    String event;
    int seatNumber;
    double dateTime;
    public void validate(){}
    public void resell(){}
    public String transfer(String newOwner){
        return newOwner;
    }

//14.Animal
    int age, weight;
    public void eat(){}
    public void sleep(){}
    public void makeSound(){}

//15.Email
    String sender, recipient, subject, messageBody;
    public void send(){}
    public void reply(){}
    public void forward(){}
    public void markAsRead(){}
}