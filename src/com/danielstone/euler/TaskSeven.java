package com.danielstone.euler;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 21/04/2016.
 */
public class TaskSeven {

    public static void main(String[] args) {
        final long startTime = System.nanoTime();

        // 2.990301ms VM

        int primeToGet =  10000;
        ArrayList<Integer> arrayList = primesUpTo(150000);
        System.out.println(arrayList.size() + " primes calculated. We need " + primeToGet);
        System.out.println(arrayList.get(primeToGet));

        final long duration = System.nanoTime() - startTime;
        double milliseconds = duration / 1000000.0;
        System.out.println("\n\n" + duration + " ns " + milliseconds + "ms");
    }

    public static ArrayList<Integer> primesUpTo(int l) {

        ArrayList<Integer> array = new ArrayList<>();

        boolean[] booleanArray = new boolean[l];
        Arrays.fill(booleanArray, true);
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
