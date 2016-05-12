package com.danielstone.euler;


public class TaskFourteen {
    public static void main(String[] args) {
        final long startTime = System.nanoTime();


        //n → n/2 (n is even)
        // n → 3n + 1 (n is odd)
        long largestChain = 0;
        int largestStart = 0;
        long testing = 0;
        long chain = 0;
        for (int i = 1; i <= 1000000; i++) {
            testing = i;
            chain = 0;
            while (testing != 1) {
                testing = applyRule(testing);
                chain ++;
            }
            System.out.println(i + " " +  chain);
            if (chain > largestChain) {
                largestStart = i;
                largestChain = chain;
            }
        }

        System.out.println(largestStart);

        final long duration = System.nanoTime() - startTime;
        double milliseconds = duration / 1000000.0;
        System.out.println("\n\n" + duration + " ns " + milliseconds + "ms");
    }

    private static long applyRule(long i) {
        if (i % 2 == 0) {
            return i / 2;
        } else {
            return 3 * i + 1;
        }
    }

}
