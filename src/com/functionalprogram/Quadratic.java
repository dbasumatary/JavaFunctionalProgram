package com.functionalprogram;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        double a = input.nextDouble();
        System.out.println("Enter the value of b : ");
        double b = input.nextDouble();
        System.out.println("Enter the value of c : ");
        double c = input.nextDouble();

        double root1, root2;

        // determinant (b^2 - 4ac)
        double det = b * b - 4.0 * a * c;

        // check if determinant is greater than 0
        if (det > 0) {

            // two real and distinct roots
            root1 = (-b + Math.sqrt(det)) / (2 * a);
            root2 = (-b - Math.sqrt(det)) / (2 * a);

            System.out.format(
                    "First Root = %.3f and Second Root = %.3f",
                    root1, root2);
        }

        // check if determinant is equal to 0
        else if (det == 0) {

            root1 = root2 = -b / (2 * a);

            System.out.format("First Root = Second Root = %.3f;", root1);
        }

        // if determinant is less than zero
        else {

            // roots are complex number and distinct
            double real = -b / (2 * a);

            double imaginary = Math.sqrt(-det) / (2 * a);

            System.out.printf("First Root = %.3f+%.3fi",
                    real, imaginary);
            System.out.printf("\nSecond Root = %.3f-%.3fi",
                    real, imaginary);
        }
    }
}
