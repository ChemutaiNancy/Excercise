package com.nancy;

import java.util.Scanner;

public class TwoIntegerParameter {

    public static void main(String[] args){

        int dividend, divisor, quotient;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        dividend = scanner.nextInt();
        System.out.println("Enter second number: ");
        divisor = scanner.nextInt();
        System.out.println("The divisor is: " + divisor);
        quotient = (dividend - divisor)/divisor;
        System.out.println("The quotient is: " + quotient);
    }
}
