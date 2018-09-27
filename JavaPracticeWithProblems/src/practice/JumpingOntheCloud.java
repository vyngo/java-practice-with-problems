/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author vyndk
 */
public class JumpingOntheCloud {

    public static void main(String[] args) {

    }

    private static int jumpingOnClouds(int[] c) {
        int numJump = 0;
        int length = c.length;
        int begin = 0;
        while (begin < length) {
            if (begin + 2 < length && c[begin + 2] != 1) {
                begin += 2;
                ++numJump;
            } else if (begin + 1 < length && c[begin + 1] != 1) {
                ++begin;
                ++numJump;
            }else{
                return numJump; // Cannot go anymore
            }
        }
        return numJump;
    }
}
