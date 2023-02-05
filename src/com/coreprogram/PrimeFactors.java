package com.coreprogram;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = scan.nextInt();

        if(number == 2 || number == 1){
            System.out.println("Enter numbers greater than 2");
            number = scan.nextInt();
        }
        System.out.println("The prime factors of " + number + " are : ");
        for(int i = 2; i <= number; i++){
            while(number%i == 0) {
                System.out.println(i);
                number /= i;
            }

        }
    }
}
