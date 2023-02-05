package com.functionalprogram;
import java.util.Scanner;
public class ArrayTwoD {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enterg m rows");
        int M = scan.nextInt();
        System.out.println("Enterg n coloums");
        int N = scan.nextInt();
        int arr[][] = new int[M][N];
        boolean ar[][] = new boolean[M][N];
        double arrr[][] = new double[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println(arr);
        //Utility.PrintArr(arr);

        System.out.println(" enter boolean arrya");

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                ar[i][j] = scan.nextBoolean();
            }
        }
        //Utility.PrintArr(ar);
        System.out.println(ar);
        System.out.println(" enter double arrya");

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arrr[i][j] = scan.nextDouble();
            }
        }
        //Utility.PrintArr(arrr);
        System.out.println(arrr);
        scan.close();
    }
}
