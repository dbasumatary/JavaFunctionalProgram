package com.functionalprogram;

import java.util.Scanner;

public class WindChill {
    static double windChill(double temp, double speed) {

        double w = 35.74 + 0.62158 * temp + (0.4275 * temp - 35.75) * Math.pow(speed, 0.16);
        return w;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Temperature in fahrenheit: ");
        double t = input.nextDouble();
        System.out.println("Enter Wind Speed in miles per hour: ");
        double v = input.nextDouble();

        if (Math.abs(t) > 50 || v > 120 || v < 3){
            System.out.println("Please enter correct input");
        }
        else {
            System.out.println("The value of Wind Chill is : " + windChill(t,v));
        }
    }
}
