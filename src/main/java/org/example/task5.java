package org.example;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(2, i);
        }
        System.out.println("The sum is: " + sum);
    }
}
