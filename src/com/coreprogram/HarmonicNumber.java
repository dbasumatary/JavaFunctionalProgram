package com.coreprogram;
import java.lang.System;
import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        double num = scan.nextDouble();
        double sum = 0.0;
        System.out.println("The Harmonic series is : ");

        for (double i = 1; i <= num; i++){
            sum = sum + 1/i;
            System.out.println(sum);
        }
    }
}

