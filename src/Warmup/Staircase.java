package Warmup;

import java.util.Scanner;

/**
 * By Prashant Singh on 8/4/2017.
 */
public class Staircase {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int stairSize = scan.nextInt();
        int n = stairSize;
        int space = 1;
        while(n-- >0){
            for(int i=1;i<=stairSize-space;i++)
                System.out.print(" ");
            for (int j=1;j<=space;j++)
                System.out.print("#");
            space++;
            if (n!=0)
                System.out.println();
        }
    }
}
