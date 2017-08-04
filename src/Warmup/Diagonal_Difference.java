package Warmup;

import java.util.Scanner;

/**
 * By Prashant Singh on 8/4/2017.
 */
public class Diagonal_Difference {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int matrixSize = scanner.nextInt();
        scanner.nextLine();
        int [][]matrix = new int[matrixSize][matrixSize];
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int i=0;i<matrixSize;i++){
            String inputLine = scanner.nextLine();
            for(int j=0;j<matrixSize;j++){
                if(Integer.parseInt(inputLine.split(" ")[j])>= -100 && Integer.parseInt(inputLine.split(" ")[j])<= 100){
                    matrix[i][j] = Integer.parseInt(inputLine.split(" ")[j]);
                    if(i == j){
                        primaryDiagonalSum += matrix[i][j];
                    }
                    if((i+j) == matrixSize-1){
                        secondaryDiagonalSum += matrix[i][j];
                    }
                }
            }
        }
        System.out.println((primaryDiagonalSum - secondaryDiagonalSum)<0?-1*(primaryDiagonalSum - secondaryDiagonalSum):(primaryDiagonalSum - secondaryDiagonalSum));
    }
}
