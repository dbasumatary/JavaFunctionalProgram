package com.functionalprogram;

import java.util.Scanner;

public class SumZero {
    static void findTriplets(int[] arr, int n)
    {
        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " "
                                + arr[j] + " "
                                + arr[k]);
                        found = true;
                    }
                }
            }
        }

        // If no triplet with 0 sum found in array
        if (found == false)
            System.out.println(" not exist ");
    }

    public static void main(String[] args)
    {

        int n;
        System.out.println("Enter the number of elements to store: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int []array = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++){
            array[i] = scan.nextInt();
        }
        //0, -1, 2, -3, 1 -2
        findTriplets(array, n);
    }
}
