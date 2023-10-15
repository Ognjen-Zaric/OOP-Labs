package org.example;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of times to print the text: ");
        int numPrints = input.nextInt();
        for (int i = 0; i < numPrints; i++) {
            printText();
        }
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
