/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapracticewithproblems.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ngoduykhanhvy
 */
public class StringSolver {
    public static boolean checkStringHasUniqueChars(String s){ // use map O(n)
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                return true;
            }
            map.put(c, 1);
        }
        return false;
    }
    
    public static boolean checkStringHasUniqueChars2(String s){ // if only ASCII, use array boolean instead of map
        // ascii only have 0-127, extend ascii 0-255, 
        boolean[] map = new boolean[128];
        for(char c : s.toCharArray()){
            if(map[(int)c] )
            map[(int)c] = true;
        }
        return false;
    }
    
    public static boolean checkStringHasUniqueChars3(String s){ // sort O(nlogn)
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int l= arr.length;
        for(int i = 1; i < l; i++){
            if(arr[i] == arr[i-1]){
                return true;
            }
        }
        return false;
    }
}
