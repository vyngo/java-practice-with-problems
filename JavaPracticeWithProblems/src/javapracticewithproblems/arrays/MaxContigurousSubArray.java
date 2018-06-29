/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapracticewithproblems.arrays;

/**
 *
 * @author vyndk
 */
public class MaxContigurousSubArray {

    /*
    * find the subarray which has maximum sum
     */
    public static void findMaxContigurousSubArray(int[] array) {
        int maxSoFar = Integer.MIN_VALUE;
        int begin = 0;
        int end = 0;
        int maxEndHere = 0;
        int currentIndex = 0;
        for (int i = 0; i < array.length; i++) {
            maxEndHere += array[i];

            if (maxSoFar < maxEndHere) {
                maxSoFar = maxEndHere;
                begin = currentIndex;
                end = i;
            }

            if (maxEndHere < 0) {
                maxEndHere = 0;
                currentIndex = i + 1;
            }
        }
        System.out.println("Max value: " + maxSoFar);
        System.out.println("sub array: begin=" + begin + " end=" + end);
    }

}
