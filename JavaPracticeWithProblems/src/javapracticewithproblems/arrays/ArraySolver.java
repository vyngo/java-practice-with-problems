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
public class ArraySolver {

    /*
    * find the subarray which has maximum sum,  Kadane's Algorithm
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

    /*
    * Find missing number in array from 1 to n
     */
    public static int findMissingNumber(int[] array, int n) {

        long expectedSum = (n * (n + 1)) / 2;
        long realSum = 0l;
        for (int element : array) {
            realSum += element;
        }
        return (int) (expectedSum - realSum);
    }

    /*
    * Given an unsorted array of non-negative integers, find a continuous sub-array which adds to a given number.
    * Print start and end index of sub-array if exist else print -1
     */
    public static void findSubArrayWithGivenSum(int[] array, int sum) {
        int n = array.length;
        int currentSum = array[0];
        int start = 0;
        int end = 0;
        for (int i = 1; i < n; i++) {
            currentSum += array[i];
            end = i;
            while(currentSum > sum && start <= i){
                currentSum -= array[start];
                start++;
            }
            if(currentSum == sum && start < n){
                System.out.println("Result: begin=" + start + " end=" + end);
                return;
            }
            
        }
        System.out.println("-1");
    }

}
