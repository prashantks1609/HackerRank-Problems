package Warmup;

import java.util.Scanner;

/**
 * By Prashant Singh on 8/4/2017.
 */
public class A_Very_Big_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }

    static long aVeryBigSum(int n, long[] ar) {
        long sum = 0;
        for(long num:ar){
            sum += num;
        }
        return sum;
    }
}
