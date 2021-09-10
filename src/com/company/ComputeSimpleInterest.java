package com.company;
import java.util.Scanner;

public class ComputeSimpleInterest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Principle Value: ");
        double p = in.nextDouble();

        System.out.print("Interest Rate: ");
        double r = in.nextDouble();

        System.out.print("Number of Years: ");
        double t = in.nextDouble();
        double A = p*(1 +(r*t)/100);

        int y=(int)t;
        int si = (int)A;

        System.out.println("After "+y+" years at "+r+"%, the investment will be worth $"+si+".");
    }

}
