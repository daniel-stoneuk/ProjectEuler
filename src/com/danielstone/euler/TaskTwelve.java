package com.danielstone.euler;

public class TaskTwelve {
    public static void main(String[] args) {
        final long startTime = System.nanoTime();

        long currentTriangularNumber = 1;
        boolean running = true;
        int currentIteration = 2;
        int factorCount = 0;

        while (running) {
            currentTriangularNumber = 0;
            for (int i = 1; i < currentIteration; i++) {
                currentTriangularNumber += i;
            }

            factorCount = 0;
            for (int j = 1; j <= Math.sqrt(currentTriangularNumber); j++) {
                if (currentTriangularNumber % j == 0) {
                    factorCount = factorCount + 2;
                }
            }
            if (factorCount > 500) break;
            currentIteration++;
        }

        System.out.println(currentTriangularNumber + " with " + factorCount + " factors");

        final long duration = System.nanoTime() - startTime;
        double milliseconds = duration / 1000000.0;
        System.out.println("\n\n" + duration + " ns " + milliseconds + "ms");
    }
}
