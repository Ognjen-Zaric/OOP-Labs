package org.example;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter the last number: ");
        int lastNum = input.nextInt();

        int currentNum = firstNum;

        while (currentNum <= lastNum) {
            System.out.print(currentNum + " ");
            currentNum++;
        }
    }
}