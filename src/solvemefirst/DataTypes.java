package solvemefirst;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * By Prashant Singh on 8/3/2017.
 */
public class DataTypes {
    public static void main(String[] args){
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double dbl = scan.nextDouble();
        scan.nextLine();
        String str = scan.nextLine();
        System.out.println(i+num);
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println(df.format(d+dbl));
        System.out.println(s+str);
        scan.close();
    }
}
