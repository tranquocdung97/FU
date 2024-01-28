package Bai42;

import java.util.Scanner;

public class Bai42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayManagement arrayManagement = new ArrayManagement(size, sc);
        arrayManagement.addElements();
        InsertionSort insertionSort = new InsertionSort(arrayManagement);
        insertionSort.run();
        arrayManagement.showArrayList();
    }
}
