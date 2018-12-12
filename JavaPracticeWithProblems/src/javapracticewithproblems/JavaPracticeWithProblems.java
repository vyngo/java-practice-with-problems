/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapracticewithproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        System.out.println((int)'c');
        System.exit(0);
    }
    
    

    public static int odd(long num) {
        // Write your code here
        int odd_factors = 0;

        for (long i = 1; 1 * i * i <= num; i++) {
            if (num % i == 0) {

                if (1 * i * i == num) {
                    if ((i & 1) == 1) {
                        odd_factors++;
                    }
                } else {
                    if ((i & 1) == 1) {
                        odd_factors++;
                    }

                    long factor = num / i;
                    if ((factor & 1) == 1) {
                        odd_factors++;
                    }
                }
            }
        }
        return odd_factors - 1;

    }
    

}
