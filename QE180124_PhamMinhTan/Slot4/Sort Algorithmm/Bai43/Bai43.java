package Bai43;

import java.util.Scanner;

public class Bai43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayManagement arrayManagement = new ArrayManagement(size, sc);
        arrayManagement.addElements();
        SelectionSort selectionSort = new SelectionSort(arrayManagement);
        selectionSort.run();
        arrayManagement.showArrayList();
    }
}
