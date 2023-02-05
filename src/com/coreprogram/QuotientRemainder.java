package com.coreprogram;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Dividend: ");
        int dividend = scan.nextInt();
        System.out.println("Enter the Divisor: ");
        int divisor = scan.nextInt();

        if(dividend < divisor){
            System.out.println("Dividend cannot be smaller than divisor");
        } else if (dividend >= divisor) {
            int quotient = dividend/divisor;
            int remainder = dividend%divisor;
            System.out.println("Quotient : " + quotient);
            System.out.println("Remainder : " + remainder);
        }

    }
}
