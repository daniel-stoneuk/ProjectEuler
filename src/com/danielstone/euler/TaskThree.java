package com.danielstone.euler;

/**
 * Created by user on 12/04/2016.
 */
public class TaskThree {

    public static void main(String[] args) {

        final long startTime = System.nanoTime();


        final long duration = System.nanoTime() - startTime;
        double milliseconds = duration / 1000000.0;
        System.out.println(duration + " ns " + milliseconds + "ms");

    }

}
