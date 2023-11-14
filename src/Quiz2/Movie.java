package Quiz2;

public class Movie {

    //This class has the following three class variable
    static String tittle="Captain America: First Avenger"; //representing the title of the movie
    static String studio="Marvel Studios"; //representing the studio that made the movie
    static String rating="PG-13"; //representing the rating of the movie (i.e. PG¬13, R, etc)

    //method that prints all details about movie
    public static void movieDetails(){
        System.out.println("The Tittle of the movie:" + tittle);
        System.out.println("Name of the Studio: "+studio);
        System.out.println("Rating: "+rating);

    }

    public static void main(String[] args) {
        Movie.movieDetails();
    }

}
