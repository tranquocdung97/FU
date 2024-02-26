package Bai37;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayManagement {
    private int n;
    private Scanner sc;
    private ArrayList<Integer> arrayList;
    public ArrayManagement(int n, Scanner sc) {
        this.n = n;
        this.sc = sc;
        this.arrayList = new ArrayList<>();
    }

    public void addElements() {
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void showResult(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
