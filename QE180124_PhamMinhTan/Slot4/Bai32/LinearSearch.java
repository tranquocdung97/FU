package Bai32;

import java.util.ArrayList;
import java.util.Scanner;

class LinearSearch {
    private ArrayList<Integer> array;

    public LinearSearch() {
        this.array = new ArrayList<>();
    }
    public void addElement (Scanner sc, int n) {
        for (int i = 0; i < n; i++) {
            array.add(sc.nextInt());
        }
    }

    public int run(int target) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == target) {
                return i;
            }
        }
        return -1;
    }
}
