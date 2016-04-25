package com.danielstone.euler;

/**
 * Created by user on 21/04/2016.
 */
public class TaskEight {
    public static void main(String[] args) {
        final long startTime = System.nanoTime();

        String the1000DigitNumber = "73167176531330624919225119674426574742355349194934" +
                "96983520312774506326239578318016984801869478851843" +
                "85861560789112949495459501737958331952853208805511" +
                "12540698747158523863050715693290963295227443043557" +
                "66896648950445244523161731856403098711121722383113" +
                "62229893423380308135336276614282806444486645238749" +
                "30358907296290491560440772390713810515859307960866" +
                "70172427121883998797908792274921901699720888093776" +
                "65727333001053367881220235421809751254540594752243" +
                "52584907711670556013604839586446706324415722155397" +
                "53697817977846174064955149290862569321978468622482" +
                "83972241375657056057490261407972968652414535100474" +
                "82166370484403199890008895243450658541227588666881" +
                "16427171479924442928230863465674813919123162824586" +
                "17866458359124566529476545682848912883142607690042" +
                "24219022671055626321111109370544217506941658960408" +
                "07198403850962455444362981230987879927244284909188" +
                "84580156166097919133875499200524063689912560717606" +
                "05886116467109405077541002256983155200055935729725" +
                "71636269561882670428252483600823257530420752963450";


        long highestProduct = 0;
        String highestProductString = "";

        for (int i = 0; i < the1000DigitNumber.length() - 13; i++) {
            long current = Integer.parseInt(the1000DigitNumber.charAt(i) + "");
            long currentProduct = current;
            String currentProductString = "" + current;
            for (int j = 1; j < 13; j++) {
                int currentIndex = i + j;
                currentProduct = currentProduct * Integer.parseInt(the1000DigitNumber.charAt(currentIndex) + "");
                currentProductString += " * " + Integer.parseInt(the1000DigitNumber.charAt(currentIndex) + "");
                if (currentProduct > highestProduct) {
                    highestProduct = currentProduct;
                    highestProductString = currentProductString;
                }
            }
        }

        System.out.println("highestProductString = " + highestProductString);
        System.out.println("highestProduct = " + highestProduct);

        final long duration = System.nanoTime() - startTime;
        double milliseconds = duration / 1000000.0;
        System.out.println("\n\n" + duration + " ns " + milliseconds + "ms");
    }
}
