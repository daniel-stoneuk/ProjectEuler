package com.danielstone.euler;

import java.util.ArrayList;

/**
 * Created by user on 12/04/2016.
 */
public class TaskThree {

    public static void main(String[] args) {

        final long startTime = System.nanoTime();

        long largestPrimeFactor = 0;
        long numberToFactor = 600851475143l;

        boolean running = true;

        while (running) {
            int upToPrimes = (int) Math.ceil(Math.sqrt(numberToFactor));
            ArrayList<Integer> arrayListOfPrimes = primesUpTo(upToPrimes);

            for (Integer primeToTest : arrayListOfPrimes) {
                if (numberToFactor % primeToTest == 0) {
                    if (primeToTest >= largestPrimeFactor) {
                        largestPrimeFactor = primeToTest;
                    }
                    System.out.println(primeToTest);
                }
            }
            running = false;
        }

        System.out.println("\n\n\nLargest prime factor: " + largestPrimeFactor);
        final long duration = System.nanoTime() - startTime;
        double milliseconds = duration / 1000000.0;
        System.out.println(duration + " ns " + milliseconds + "ms");

    }


    public static ArrayList<Integer> primesUpTo(int l) {

        ArrayList<Integer> array = new ArrayList<>();

        boolean[] booleanArray = new boolean[l];
        for (int b = 2; b < booleanArray.length; b++) {
            booleanArray[b] = true;
        }
        for (int i = 2; i < Math.sqrt(l); i++) {
            if (booleanArray[i]) {
                for (int j = (i*i); j < l; j = j + i) {
                    booleanArray[j] = false;
                }
            }
        }
        for (int b = 0; b < booleanArray.length; b++) {
            if (booleanArray[b]) {
                array.add(b);
            }
        }
        return array;
    }
}
