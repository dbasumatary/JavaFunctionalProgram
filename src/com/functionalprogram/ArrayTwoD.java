package com.functionalprogram;
import java.util.Scanner;
public class ArrayTwoD {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter m rows: ");
        int M = scan.nextInt();
        System.out.println("Enter n columns: ");
        int N = scan.nextInt();
        int arrayFirst[][] = new int[M][N];
        boolean arraySec[][] = new boolean[M][N];
        double arrayThird[][] = new double[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arrayFirst[i][j] = scan.nextInt();
            }
        }
        System.out.println(arrayFirst);

        System.out.println(" Enter boolean array: ");

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arraySec[i][j] = scan.nextBoolean();
            }
        }
        System.out.println(arraySec);
        System.out.println(" Enter double array: ");

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arrayThird[i][j] = scan.nextDouble();
            }
        }
        System.out.println(arrayThird);
        scan.close();
    }
}
