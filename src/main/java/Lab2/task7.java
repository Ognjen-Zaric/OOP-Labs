package Lab2;

public class task7 {

    public static void printStars(int numStars) {
        for (int i = 0; i < numStars; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }
}

