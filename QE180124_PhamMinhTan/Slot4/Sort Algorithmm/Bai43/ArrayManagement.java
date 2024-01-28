package Bai43;

import java.util.ArrayList;
import java.util.Scanner;

class ArrayManagement {
    private int size;
    private Scanner sc;
    private ArrayList<Integer> arrayList;
    public ArrayManagement(int size, Scanner sc) {
        this.arrayList = new ArrayList<>();
        this.sc = sc;
        this.size = size;
    }

    public void addElements() {
        for (int i = 0; i < size; i++) {
            arrayList.add(sc.nextInt());
        }
    }

    public void showArrayList() {
        for (int element : arrayList) {
            System.out.print(element + " ");
        }
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }
}
