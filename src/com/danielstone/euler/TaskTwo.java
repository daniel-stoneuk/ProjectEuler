package com.danielstone.euler;

public class TaskTwo {
    public static void main(String[] args) {

        final long startTime = System.nanoTime();

        int previousTwo = 0;
        int previousOne = 1;
        int current = 0;
        int sum = 0;
        while ( current < 4000000 ){
            current =+ previousOne + previousTwo;
            if (current < 4000000) {
                previousTwo = previousOne;
                previousOne = current;
                if (current % 2 == 0)
                    sum += current;
            }
        }
        System.out.println(sum);

        final long duration = System.nanoTime() - startTime;
        double milliseconds = duration / 1000000.0;
        System.out.println(duration + " ns " + milliseconds + "ms");

    }
}
