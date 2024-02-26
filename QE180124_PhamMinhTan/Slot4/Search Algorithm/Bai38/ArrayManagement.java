package Bai38;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayManagement {
    private int n;
    private ArrayList<Integer> arrayList;
    private Scanner sc;

    public ArrayManagement(int n, Scanner sc) {
        this.n = n;
        this.arrayList = new ArrayList<>();
        this.sc = sc;
    }

    public void addElements() {
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }
}
