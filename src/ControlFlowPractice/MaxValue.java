package ControlFlowPractice;

public class MaxValue {

    public static void main(String[] args) {
        int[] a={5,7,9,3,11};
        int max=0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        System.out.println("The Max number is: "+max);
    }
}
