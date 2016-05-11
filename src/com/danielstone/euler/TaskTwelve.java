package com.danielstone.euler;

public class TaskTwelve {
    public static void main(String[] args) {
        final long startTime = System.nanoTime();

        //initialise variables
        long currentTriangularNumber;
        int factorCount;

        // iteration is the number of integers we need
        // to add to get the current triangular number
        int currentIteration = 1;

        while (true) {

            // reset the current number to 0
            currentTriangularNumber = 0;

            // add every natural number up to the current iteration
            for (int i = 0; i <= currentIteration; i++) {
                currentTriangularNumber += i;
            }
            // we now have the next triangular number

            // reset the factor count (number of factors)
            factorCount = 0;

            // as there are 2 factors for every number up to the sqrt of a number
            // we only need to test every number up to the sqrt of the current number.

            // Test every number up to the sqrt, to see if it divides perfectly into
            // the current number.
            for (int j = 1; j <= Math.sqrt(currentTriangularNumber); j++) {
                if (currentTriangularNumber % j == 0) {
                    factorCount = factorCount + 2;
                }
            }

            if (factorCount > 500) break;

            // if factor count is less than 500, increase currentIteration by 1
            // ready for the next run.
            currentIteration++;
        }

        System.out.println(currentTriangularNumber + " with " + factorCount + " factors");

        final long duration = System.nanoTime() - startTime;
        double milliseconds = duration / 1000000.0;
        System.out.println("\n\n" + duration + " ns " + milliseconds + "ms");
    }
}
