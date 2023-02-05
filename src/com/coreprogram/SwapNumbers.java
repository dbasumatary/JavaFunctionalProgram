package com.coreprogram;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("----- Before Swap ------");
        System.out.println("First number: ");
        int num1 = scan.nextInt();
        System.out.println("Second number: ");
        int num2 = scan.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("----- After Swap ------");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

    }
}
