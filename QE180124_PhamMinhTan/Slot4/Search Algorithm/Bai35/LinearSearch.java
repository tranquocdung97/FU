package Bai35;

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

    public void findEvenNumFromOddIndex() {
        boolean valid = false;
        for (int i = 0; i < array.size(); i+=2) {
            if (array.get(i) % 2 != 0) {
                System.out.print(array.get(i) + " ");
                valid = true;
            }
        }
        if (!valid) {
            System.out.println("NULL");
        }
    }
}
