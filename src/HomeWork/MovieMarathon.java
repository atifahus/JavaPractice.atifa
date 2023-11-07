package HomeWork;

public class MovieMarathon {
    public static void main(String[] args) {
        int totalTime = 0;
        int limit = 300; // 5 hours
        int movieDuration = 120;
        while(totalTime+movieDuration<=limit){
            totalTime+=movieDuration;
            System.out.println("Movie playing");
        }
        System.out.println("you have exceed the limit");
    }


}
