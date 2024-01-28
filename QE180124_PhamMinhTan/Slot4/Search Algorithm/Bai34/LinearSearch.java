package Bai34;

import java.util.ArrayList;
import java.util.Scanner;

class LinearSearch {
    protected Scanner sc;
    protected int n;
    protected ArrayList<Integer> array;

    public LinearSearch(Scanner sc, int n) {
        this.sc = sc;
        this.array = new ArrayList<>();
        this.n = n;
    }

    public void addElements() {
        for (int i = 0; i < n; i++) {
            array.add(sc.nextInt());
        }
    }

    public int countFrequency(int target) {
        int count = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equals(target)) {
                count++;
            }
        }
        return count;
    }
}
