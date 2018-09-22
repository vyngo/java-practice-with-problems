/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.IOException;

/**
 *
 * @author vyndk
 */
public class ProgrammerDay {

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter;
//        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
//            bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//            int year = Integer.parseInt(bufferedReader.readLine().trim());
//            String result = dayOfProgrammer(year);
//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
//        }
//        bufferedWriter.close();
        System.out.println(dayOfProgrammer(2017));
    }

    private static String dayOfProgrammer(int year) {
        int nday = 0;
        int month = 1;
        if (year == 1918) {
            nday = 46;
            month = 3;
        }
        while (nday <= 256) {
            nday += getDayOfMonth(month, year);
            ++month;
        }
        month--;
        int dayInMonth = getDayOfMonth(month, year);
        while (nday != 256) {
            dayInMonth--;
            nday--;
        }
        return printDay(dayInMonth, month, year);
    }

    private static String printDay(int day, int month, int year) {
        return (String.format("%02d", day) + "." + String.format("%02d", month) + "." + year);
    }

    private static int getDayOfMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2: {
                if (isLeapYear(year)) {
                    return 29;
                }
                return 28;
            }
            default:
                return 30;
        }
    }

    private static boolean isLeapYear(int year) {
        if (year < 1919) {
            return year % 4 == 0;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
