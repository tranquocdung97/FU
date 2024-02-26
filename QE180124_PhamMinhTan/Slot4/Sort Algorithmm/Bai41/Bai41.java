package Bai41;

import java.util.Scanner;

public class Bai41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayManagement arrayManagement = new ArrayManagement(size, sc);
        arrayManagement.addElements();
        BubbleSort bubbleSort = new BubbleSort(arrayManagement);
        bubbleSort.run();
        arrayManagement.showArrayList();
    }
}
