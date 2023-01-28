package mypackage.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 15, 7, 25};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 7));
        System.out.println(Arrays.binarySearch(numbers, -7));

        int[] copy = Arrays.copyOf(numbers, 3);
        System.out.println(Arrays.toString(copy));

        int[] copyRange = Arrays.copyOfRange(numbers, 3, 5);
        System.out.println(Arrays.toString(copyRange));


    }
}
