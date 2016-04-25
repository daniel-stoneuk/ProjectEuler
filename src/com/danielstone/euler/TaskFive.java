package com.danielstone.euler;

/**
 * Created by user on 21/04/2016.
 */
public class TaskFive {

    public static void main(String[] args) {
        final long startTime = System.nanoTime();

        // 213.591438ms VM

        /*
        Notes:
        needs to be a multiple of 5
         */

        int test = 20;
        while (true) {
            if(isEvenlyDivisible(test, 20)) {
                System.out.println(test);
                break;
            }
            test += 20;
        }
        System.out.println("Highest value " + test);

        final long duration = System.nanoTime() - startTime;
        double milliseconds = duration / 1000000.0;
        System.out.println("\n\n" + duration + " ns " + milliseconds + "ms");
    }

    public static boolean isEvenlyDivisible(int i, int upTo) {
        for (int j = 1; j < upTo; j++) {
            if (i % j != 0) {
                return false;
            }
        }
        return true;
    }

}
