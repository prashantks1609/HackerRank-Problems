package Warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * By Prashant Singh on 8/4/2017.
 */
public class Time_Conversion {
    static String timeConversion(String s) {
        String time, meredian;
        meredian = s.substring(s.length()-2);
        int hour = Integer.parseInt(s.substring(0,2));
        if(meredian.equals("PM")){
            if(hour==12){
            }
            else
                hour+=12;
        } else if (hour ==12 && meredian.equals("AM")){
            hour=0;
        }
        DecimalFormat df = new DecimalFormat("00");
        time = df.format(hour)+s.substring(2,s.length()-2);
        return time;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
