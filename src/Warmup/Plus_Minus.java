package Warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * By Prashant Singh on 8/4/2017.
 */
public class Plus_Minus {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int positiveCount = 0,negativeCount = 0,zeroCount = 0, arraySize = scan.nextInt();
        scan.nextLine();
        String intInputs = scan.nextLine();
        int[] arr = new int[arraySize];
        for(int i=0;i<arraySize;i++){
            arr[i] = Integer.parseInt(intInputs.split(" ")[i]);
            if(arr[i]>0){
                positiveCount++;
            } else if(arr[i]<0){
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format((float)positiveCount/arraySize));
        System.out.println(df.format((float)negativeCount/arraySize));
        System.out.println(df.format((float)zeroCount/arraySize));
    }
}
