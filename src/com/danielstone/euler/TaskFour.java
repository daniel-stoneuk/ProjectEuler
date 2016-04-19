package com.danielstone.euler;

/**
 * Created by user on 19/04/2016.
 */
public class TaskFour {

    public static void main(String[] args) {

        final long startTime = System.nanoTime();

        int large = 999;
        int small = 100;
        int highest = 0;

        for (int one = large; one >= small; one--) {
            for (int two = large; two >= small; two--) {
                int product = two * two;
                if (product > highest)
                    if (isPalindromic(product)) {
                        highest = product;
                    }
            }
        }
        System.out.println("highest = " + highest);


        final long duration = System.nanoTime() - startTime;
        double milliseconds = duration / 1000000.0;
        System.out.println(duration + " ns " + milliseconds + "ms");

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
