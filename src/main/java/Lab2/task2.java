package Lab2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int read;
        int sum = 0;

        System.out.print("Enter the first number: ");
        read = reader.nextInt();
        sum += read;

        System.out.print("Enter the second number: ");
        read = reader.nextInt();
        sum += read;

        System.out.print("Enter the third number: ");
        read = reader.nextInt();
        sum += read;

        System.out.println("The sum is: " + sum);
    }
}