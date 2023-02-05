package com.coreprogram;

import java.util.Scanner;

public class CoinPercentage {
/*
    static void flipCoin() {
        int heads = 0;
        int tails = 0;
        int headspercent = 0;
        int tailspercent = 0;


        for (int i in range(1000))

        {
            int coin = random.randint(1, 2);

            if (coin == 1) { //# if coin value is assigned as 1
                heads += 1; //#increase heads count by 1
            } else {
                tails += 1;
            }
        }


        headspercent = heads / 10.0; //# since we're rolling 1000 times, /10 will give percentage
        tailspercent = 100.0 - headspercent; //# no need to recalculate 100 - heads = tails %

        print("Heads percent: " + str(headspercent)); //# printing the values on screen

        print("Tails percent: " + str(tailspercent)); //# converting numbers to string by str()

        flipCoin() //# calling the function
    }*/

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




