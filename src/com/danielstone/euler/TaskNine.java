package com.danielstone.euler;

/**
 * Created by user on 26/04/2016.
 */
public class TaskNine {

    public static void main(String[] args) {
        final long startTime = System.nanoTime();

        int a = 0, b =0, c = 0, testUpTo = 500;
        boolean running = true;
        do {
            for (int i = 1; i <= testUpTo; i++) {
                if (!running) break;
                a = i;
                for (int j = 1; j <= testUpTo; j++) {
                    if (!running) break;
                    b = j;
                    for (int k = 1; k < testUpTo; k++) {
                        if (!running) break;
                        c = k;
                        if ((a*a) + (b*b) == (c*c) && a + b + c ==1000) {
                            System.out.println("a = " + a + " b = " + b + " c = " + c);
                            running = false;
                            break;
                        }
                    }
                }
            }
            testUpTo = testUpTo + 250;
        } while (running);
        int product = a * b * c;
        System.out.println("product = " + product);

        final long duration = System.nanoTime() - startTime;
        double milliseconds = duration / 1000000.0;
        System.out.println("\n\n" + duration + " ns " + milliseconds + "ms");
    }

}
