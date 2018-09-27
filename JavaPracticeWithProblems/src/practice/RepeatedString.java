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
public class RepeatedString {

    public static void main(String[] args) {
        System.out.println(repeatedString("a", 1000000000000L));
    }
    
    private static long repeatedString(String s, long n) {
        int totalAInS = 0;
        for(int i = 0; i < s.length(); i++){
            String tmp = String.valueOf(s.charAt(i));
            if("a".equals(tmp)){
                ++totalAInS;
            }
        }
        long ret = totalAInS * (n / s.length());
        for(int i = 0 ; i < (n % s.length()); i++){
            String tmp = String.valueOf(s.charAt(i));
            if("a".equals(tmp)){
                ++ret;
            }
        }
        return ret;
    }
}
