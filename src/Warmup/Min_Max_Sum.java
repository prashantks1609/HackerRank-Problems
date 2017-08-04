package Warmup;

import java.util.Scanner;

/**
 * By Prashant Singh on 8/4/2017.
 */
public class Min_Max_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr_size = 5;
        long[] arr = new long[arr_size];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long largest = arr[0],smallest = arr[0],largestSum = 0,smallestSum = 0;
        for(int i = 0;i<arr_size;i++){
            for(int j=1;j<arr_size-i;j++){
                if (arr[j]>arr[j-1]){
                    long temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        for(int i =0;i<arr_size;i++){
            if (i != 0){
                smallestSum+=arr[i];
            }
            if (i != arr_size-1){
                largestSum+=arr[i];
            }
        }
        System.out.println(smallestSum+" "+largestSum);
    }
}
