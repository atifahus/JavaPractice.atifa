package ControlFlowPractice;

public class TwoArray {
    public static void main(String[] args) {
        String[][] testData={{"atifa","abc123"},{"hus","qwe"},{"tis","qqq"}};
        for (int i=0; i<testData.length;i++){
            for (int j=0; j<testData.length;j++){

                System.out.print(testData[i][j]);
            }
        }

    }
}
