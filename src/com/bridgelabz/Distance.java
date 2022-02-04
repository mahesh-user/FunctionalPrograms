package com.bridgelabz;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println(" enter values ");
        int x = sc.nextInt();

        double distance = 0;
        double a = (Math.pow(x, x));
        int y = sc.nextInt();
        double b = (Math.pow(y , y));
        distance = Math.sqrt((a + b));
        System.out.println(distance);
    }
}
