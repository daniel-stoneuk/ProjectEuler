package com.danielstone.euler;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 26/04/2016.
 */
public class TaskTen {

    public static void main(String[] args) {
        final long startTime = System.nanoTime();

        long sum = 0;
        ArrayList<Integer> arrayListOfPrimes = primesUpTo(2000000);

        for (Integer i:
             arrayListOfPrimes) {
            sum = sum + i;
        }

        System.out.println("\nsum = " + sum);
        final long duration = System.nanoTime() - startTime;
        double milliseconds = duration / 1000000.0;
        System.out.println("\n\n" + duration + " ns " + milliseconds + "ms");
    }

    public static ArrayList<Integer> primesUpTo(int l) {

        ArrayList<Integer> array = new ArrayList<>();

        boolean[] booleanArray = new boolean[l];
        Arrays.fill(booleanArray, true);
        for (int i = 2; i < Math.sqrt(l); i++) {
            if (booleanArray[i]) {
                for (int j = (i*i); j < l; j = j + i) {
                    booleanArray[j] = false;
                }
            }
        }

        booleanArray[1] = false; // one is not a prime number

        for (int b = 0; b < booleanArray.length; b++) {
            if (booleanArray[b]) {
                array.add(b);
            }
        }
        return array;
    }

}
