/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapracticewithproblems;

import javapracticewithproblems.arrays.ArraySolver;

/**
 *
 * @author vyndk
 */
public class JavaPracticeWithProblems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {1,2,3,4,5,6,8,9, 10};
        int missingNumber = ArraySolver.findMissingNumber(array, 10);
        System.out.println(missingNumber);
        System.exit(0);
    }
    
}
