package org.example;

import java.util.Scanner;

public class Date24hrFormatCoversion {

    private static final Scanner scanner = new Scanner(System.in);

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {

        String[] str = s.split(":");
        str[2] = str[2].substring(0, str[2].length()-2);
        String result = null;
        if(Integer.valueOf(str[0]) < 12 && s.endsWith("PM")){
            result = String.valueOf(Integer.valueOf(str[0]) + 12) ;
        }
        else if(Integer.valueOf(str[0]) % 12 == 0 && Integer.valueOf(str[2]) > 59 && s.endsWith("PM")) {
            result = "00";
        }
        else if (Integer.valueOf(str[0]) % 12 == 0 && s.endsWith("AM")) {
                result = "00";
        }
        else {
            result = str[0];
        }
        return result+ ":" + str[1] +":"+str[2];
    }

    public static void main(String[] args) {

        String s = scanner.next();

        String result = timeConversion(s);
        System.out.println(result);

        scanner.close();
    }

}
