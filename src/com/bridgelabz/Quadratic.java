package com.bridgelabz;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        double x;
        double y;
        double delta;
        Scanner value = new Scanner(System.in);
        System.out.println(" enter numbers");
        double a = value.nextInt();
        double b = value.nextInt();
        double c = value.nextInt();
        delta = (b*b) - (4*a*c);
        System.out.println("result is " + delta);
        x = Math.pow(((-b+Math.sqrt(delta))/2*a),2);
        System.out.println("the value of " + x );
        y = Math.pow(((-b-Math.sqrt(delta))/2*a),2)/2;
        System.out.println("the value of "  + y);
    }
}
