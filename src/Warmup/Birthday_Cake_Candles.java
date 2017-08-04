package Warmup;

import java.util.Scanner;

/**
 * By Prashant Singh on 8/4/2017.
 */
public class Birthday_Cake_Candles {
    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int count = 0, tallest = 0;
        for (int num:ar){
            if (num>tallest)
                tallest = num;
        }
        for (int num:ar){
            if (num == tallest)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n>=1&&n<=100000){
            int[] ar = new int[n];
            for(int ar_i = 0; ar_i < n; ar_i++){
                int val = in.nextInt();
                if (val>=1&&val<=10000000)
                    ar[ar_i] = val;
            }
            int result = birthdayCakeCandles(n, ar);
            System.out.println(result);
        }
    }
}
