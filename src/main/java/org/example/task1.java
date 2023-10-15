package org.example;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter the password: ");
            String input = scanner.nextLine();
            if (input.equals("carrot")) {
                System.out.println("Right!");
                System.out.println("The secret is: jryy qbar!");
                break;
            } else {
                System.out.println("Wrong!");
                continue;
        }


        }
    }
}
