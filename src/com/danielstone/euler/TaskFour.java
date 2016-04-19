package com.danielstone.euler;

import java.util.ArrayList;

/**
 * Created by user on 19/04/2016.
 */
public class TaskFour {

    public static void main(String[] args) {

        final long startTime = System.nanoTime();

        int large = 999;
        int small = 99;

        int highest = 0;

        boolean running = true;

            for (int two = large; two > small; two--) {
                for (int one = large; one > small; one--) {
                    if (one * two > highest)
                        if (isProductPalindromic(one, two)) {
                            highest = one * two;
                            //System.out.println("highest = " + highest);
                        }
                }
            }



        System.out.println("highest = " + highest);
        final long duration = System.nanoTime() - startTime;
        double milliseconds = duration / 1000000.0;
        System.out.println(duration + " ns " + milliseconds + "ms");

    }

    public static boolean isProductPalindromic(int a, int b) {
        int product = a * b;
        return isPalindromic(product);
    }

    public static boolean isPalindromic(int i) {
        boolean result = true;
        String iString = Integer.toString(i);
        int lengthOfi = iString.length();
        for (int j = 0; j < lengthOfi / 2; j++) {
            if (iString.charAt(j) != iString.charAt(lengthOfi - 1 - j)) {
                result = false;
            }
        }
        return result;
    }
}
