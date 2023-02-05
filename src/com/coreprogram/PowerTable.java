package com.coreprogram;

import java.util.Scanner;

public class PowerTable {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        for(int i = 0; i <= n; i++){
            if(n < 31){
                System.out.println("Power of 2: 2^" + (i) +  " = " + Math.pow(2,i));
            }
            else{
                System.out.println("The value of n should be less than 31");
                n = scan.nextInt();
            }
        }

    }

}
