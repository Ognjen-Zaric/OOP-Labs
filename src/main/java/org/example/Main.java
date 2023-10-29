package org.example;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = input.nextInt();
        int i = 0;
        int powInt = 0;
        while (i <= n){
            powInt = powInt + (int)Math.pow(2, i);
            i++;
        }
        System.out.println(powInt);
    }
}