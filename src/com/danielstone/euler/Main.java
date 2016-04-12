package com.danielstone.euler;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        final long startTime = System.nanoTime();


        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            if ((i+1) % 3 == 0 || (i+1) % 5 == 0) {
                array.add((i+1));
            }
        }


        long sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum = sum + array.get(i);
        }

        System.out.print("" + sum);
        final long duration = System.nanoTime() - startTime;
        final double milliseconds = duration / 1000000.0;
        System.out.println(duration + " ns " + milliseconds + "ms");
    }
}
