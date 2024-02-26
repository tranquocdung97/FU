package Bai36;

import java.util.ArrayList;
import java.util.Scanner;

class BinarySearch {
    private int n;
    private ArrayList<Integer> arrayList;

    private Scanner sc;

    public BinarySearch(int n, Scanner sc) {
        this.n = n;
        this.arrayList = new ArrayList<>();
        this.sc = sc;
    }

    public int run(int target) {
        int left = 0; int right = arrayList.size() - 1;
        if (arrayList.get(0).equals(target)) {
            return 0;
        }
        while (true) {
            int mid = left + (right - left) / 2;
            if (target == arrayList.get(mid)) {
                return mid;
            } else if (target > mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (left > right) {
                break;
            }
        }
        return -1;
    }

    public void addElements() {
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
    }
}
