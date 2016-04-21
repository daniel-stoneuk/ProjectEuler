package com.danielstone.euler;

/**
 * Created by user on 21/04/2016.
 */
public class TaskSix {

    public static void main(String[] args) {
        final long startTime = System.nanoTime();

        // 0.252109ms VM

        int[] result = sumOfUpToAndSquaresUpTo(100);
        int difference = result[1] - result[0];
        System.out.println("Difference = " + difference);

        final long duration = System.nanoTime() - startTime;
        double milliseconds = duration / 1000000.0;
        System.out.println("\n\n" + duration + " ns " + milliseconds + "ms");
    }

    public static int[] sumOfUpToAndSquaresUpTo(int upTo) {
        int[] result = new int[] {0,0};
        for (int i = 1; i <= upTo ; i++) {
            result[0] = result[0] + (i * i);
            result[1] = result[1] + i;
        }
        result[1] = result[1] * result[1];
        return result;
    }


}
