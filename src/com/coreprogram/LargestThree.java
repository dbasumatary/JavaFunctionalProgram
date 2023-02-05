package com.coreprogram;

import java.util.Scanner;

public class LargestThree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = scan.nextInt();
        System.out.println("Enter second number: ");
        int second = scan.nextInt();
        System.out.println("Enter third number: ");
        int third = scan.nextInt();

        if( first >= second && first >= third)
            System.out.println("The largest number among the three is " + first);

        else if (second >= first && second >= third)
            System.out.println("The largest number among the three is " + second);

        else
            System.out.println("The largest number among the three is " + third);
    }
}
