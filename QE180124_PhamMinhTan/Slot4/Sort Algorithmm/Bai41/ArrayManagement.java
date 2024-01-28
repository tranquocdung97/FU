package Bai41;

import java.util.ArrayList;
import java.util.Scanner;

class ArrayManagement {
    private int size;
    private ArrayList<Integer> arrayList;
    private Scanner sc;

    public ArrayManagement(int size, Scanner sc) {
        this.size = size;
        this.sc = sc;
        this.arrayList = new ArrayList<>();
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void addElements() {
        for (int i = 0; i < size; i++) {
            if (sc.hasNextInt()) {
                arrayList.add(sc.nextInt());
            } else {
                System.out.println("Integer only");
                break;
            }
        }
    }
    public void showArrayList () {
        for (int elements : arrayList) {
            System.out.print(elements + " ");
        }
    }
}
