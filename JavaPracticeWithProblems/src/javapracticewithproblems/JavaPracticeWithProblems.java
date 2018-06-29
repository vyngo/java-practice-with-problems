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
        int[] array = {1, 4, 20, 3, 10, 5};
        ArraySolver.findSubArrayWithGivenSum(array, 33);
        
        int[] array2 = {1, 4, 0, 0, 3, 10, 5};
        ArraySolver.findSubArrayWithGivenSum(array2, 7);
        
        int[] array3 = {1, 4};
        ArraySolver.findSubArrayWithGivenSum(array3, 0);
       
        System.exit(0);
    }
    
}
