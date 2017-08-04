package solvemefirst;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * By Prashant Singh on 8/3/2017.
 */

//
//Input Format
//
//        There are  lines of numeric input:
//        The first line has a double,  (the cost of the meal before tax and tip).
//        The second line has an integer,  (the percentage of  being added as tip).
//        The third line has an integer,  (the percentage of  being added as tax).
public class Operators {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble();
        int tipPercent = scan.nextInt();
        int taxPercent = scan.nextInt();

        double tipCost = (mealCost*tipPercent)/100;
        double taxCost = (mealCost*taxPercent)/100;

        DecimalFormat df = new DecimalFormat("0");

    }
}
