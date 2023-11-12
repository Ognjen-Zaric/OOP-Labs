package Lab6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = array[index];
        int smallestIndex = index;
        for (int i = index; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        int temp2 = array[index2];
        array[index1] = temp2;
        array[index2] = temp;
    }




    public static int printElegantly(int[] array) {
        int i = 0;
        while (i < array.length) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] array = { -3, 2, 3, 4, 7, 8, 12};
            Scanner reader = new Scanner(System. in);
            System.out.print("Values of the array: " + Arrays.toString(array));
            System.out.println();
            System.out.print ("Enter searched number: ");
            String searchedValue = reader.nextLine();
            System.out.println();
            boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));
    }
}
