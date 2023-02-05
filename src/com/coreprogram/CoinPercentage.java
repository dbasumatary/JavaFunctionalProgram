package com.coreprogram;

import java.util.Scanner;

public class CoinPercentage {


    public static void main(String[] args) {
        System.out.println("Enter positive integer: ");
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        double heads = 0;
        double tails = 0;
        double headspercent;
        double tailspercent;

        for(int i = 0; i <= n; i++){
            double coin = Math.random();

            if (coin < 0.5){
                heads+=1;
            }
            else{
                tails+=1;
            }
        }
        headspercent = (heads * 100)/n;
        System.out.println("Percentage of heads is : " + headspercent);
        tailspercent = 100 - headspercent;
        System.out.println("Percentage of tails is : " + tailspercent);
    }
}
