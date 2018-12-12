/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vyndk
 */
public class PerfectTeam {

    public static void main(String[] args) {
        System.out.println(differentTeams("pcmpcmbbbzz"));
    }

    /*
     * Complete the function below.
     */
    private static int differentTeams(String skills) {
        Map<String, Integer> totalStudentBySkill = getTotalStudentBySkill(skills);
        
        int totalP = (totalStudentBySkill.containsKey("p"))? totalStudentBySkill.get("p") : 0;
        int totalC = (totalStudentBySkill.containsKey("c"))? totalStudentBySkill.get("c") : 0;
        int totalM = (totalStudentBySkill.containsKey("m"))? totalStudentBySkill.get("m") : 0;
        int totalB = (totalStudentBySkill.containsKey("b"))? totalStudentBySkill.get("b") : 0;
        int totalZ = (totalStudentBySkill.containsKey("z"))? totalStudentBySkill.get("z") : 0;
        int numberTeams = 0;
        while (totalP > 0 && totalC > 0 && totalM > 0 && totalB > 0 && totalZ > 0){
            ++numberTeams;
            --totalP;
            --totalC;
            --totalM;
            --totalB;
            --totalZ;
        }
        return numberTeams;
    }

    private static Map<String, Integer> getTotalStudentBySkill(String skills) {
        Map<String, Integer> totalStudentBySkill = new HashMap<>();
        int length = skills.length();
        for (int i = 0; i < length; i++) {
            String skill = String.valueOf(skills.charAt(i));
            if (totalStudentBySkill.containsKey(skill)) {
                int total = totalStudentBySkill.get(skill) + 1;
                totalStudentBySkill.put(skill, total);
            } else {
                totalStudentBySkill.put(skill, 1);
            }
        }
        return totalStudentBySkill;
    }
}
