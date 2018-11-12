/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author vyndk
 */
public class LongestWordInDict {

    /*
    Given a string S and a set of words D, find the longest word in D that is a subsequence of S.

Word W is a subsequence of S if some number of characters, possibly zero, can be deleted from S to form W, without reordering the remaining characters.

Note: D can appear in any format (list, hash table, prefix tree, etc.

For example, given the input of S = "abppplee" and D = {"able", "ale", "apple", "bale", "kangaroo"} the correct output would be "apple"

The words "able" and "ale" are both subsequences of S, but they are shorter than "apple".
The word "bale" is not a subsequence of S because even though S has all the right letters, they are not in the right order.
The word "kangaroo" is the longest word in D, but it isn't a subsequence of S.
     */
    public static void main(String[] args) {
        String s = "abppplee";

        String[] d = {"able", "ale", "apple", "bale", "kangaroo"};
        String res = findLongest(s, d);
        System.out.println(res);
    }

    private static String findLongest(String s, String[] d) {
        List<String> dict = Arrays.asList(d);
        Collections.sort(dict, (String o1, String o2) -> -(o1.length() - o2.length()));
        for (String w : dict) {
            if(isIn(s, w)){
                return w;
            }
        }
        return null;
    }

    private static boolean isIn(String s, String w) {
        int i = 0;
        while (i < w.length()) {
            for (int j = 0; j < s.length(); j++) {
                String c = String.valueOf(w.charAt(i));
                String cs = String.valueOf(s.charAt(j));
                if(c.equals(cs)){
                    i++;
                    if(i == w.length()){
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

}
