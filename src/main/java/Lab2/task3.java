package Lab2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num;

        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            sum += num;
            System.out.print("sum now: " + sum);
            System.out.println(" ");
        } while (num != 0);

        System.out.println("The sum is: " + sum);
    }
}
