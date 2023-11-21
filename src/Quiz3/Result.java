package Quiz3;

public class Result {
    /*Create a class Result with int type array "subject" to save marks of 5 different subjects.
    * Print individual marks of each subject using for loop and while loop
    * (Your output should be like this: Marks of subject 1 is : 90 ....),
    * find total marks by adding marks of that array,
     * and find average marks (use both for loop and while loop)*/
    public static int[] subject = {1, 2, 3, 4, 5};
    public static int[] marks = {90, 80, 70, 60, 50};
    static int totalMarks = 0;


    public static void marksEachSubject(){
        //Print individual marks of each subject using for loop
        System.out.println("Below is the marks for each subject using for loop:");
        for (int i = 0; i < subject.length; i++) {
            if (subject[i] == 1) {
                System.out.println("Marks for subject 1 : 90");
            } else if (subject[i] == 2) {
                System.out.println("Marks for subject 2 : 80");
            } else if (subject[i] == 3) {
                System.out.println("Marks for subject 3 : 70");
            } else if (subject[i] == 4) {
                System.out.println("Marks for subject 4 : 60");
            } else if (subject[i] == 5) {
                System.out.println("Marks for subject 5 : 50");
            } else {
                System.out.println("Invalid. Enter correct subject");
            }
        }
    }

    public static void whileMarksEachSub(){
        //Print individual marks of each subject using while loop
        System.out.println("Below is the marks for each subject using while loop:");
        int j = 0;
        while (j < subject.length) {
            if (subject[j] == 1) {
                System.out.println("Marks of subject 1 is : 90");
            } else if (subject[j] == 2) {
                System.out.println("Marks of subject 2 is : 80");
            } else if (subject[j] == 3) {
                System.out.println("Marks of subject 3 is : 70");
            } else if (subject[j] == 4) {
                System.out.println("Marks of subject 4 is : 60");
            } else if (subject[j] == 5) {
                System.out.println("Marks of subject 5 is : 50");
            } else {
                System.out.println("Invalid. Enter correct subject");
            }
            j++;
        }
    }

    public static void totalMarksForLoop(){
       //Find total marks by adding marks of that array using for loop

        for (int m = 0; m < marks.length; m++) {
            totalMarks = marks[m] + totalMarks;
        }
        System.out.println("Total marks of all subject using for loop is: " + totalMarks);
    }



    public static void whileTotalMarks(){
        //Find total marks by adding marks of that array using while loop
        int n = 0;
        int whileTotalMarks = 0;
        while (n < marks.length) {
            whileTotalMarks = marks[n] + whileTotalMarks;
            n++;
        }
        System.out.println("Total marks of all subject using while loop is: " + whileTotalMarks);
    }

    public static void averageMarksForLoop(){
        //find average marks using for loop
        int averageMarks = 0;
        for (int a = 0; a < marks.length; a++) {
            averageMarks = totalMarks / marks.length;
        }
        System.out.println("Average marks using for loop: " + averageMarks);
    }

    public static void whileAverageMarks(){

        //find average marks using while loop
        int b = 0;
        int whileAverageMarks=0;
        while (b<marks.length){
            whileAverageMarks=totalMarks/marks.length;
            b++;
        }
        System.out.println("Average marks using while loop: "+ whileAverageMarks);
    }
    public static void main(String[] args) {

        Result.marksEachSubject();
        Result.whileMarksEachSub();
        Result.totalMarksForLoop();
        Result.whileTotalMarks();
        Result.averageMarksForLoop();
        Result.whileAverageMarks();

    }

}
