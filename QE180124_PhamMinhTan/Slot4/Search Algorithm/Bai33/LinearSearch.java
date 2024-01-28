package Bai33;

import java.util.ArrayList;
import java.util.Scanner;

class LinearSearch {
    protected int n;
    protected ArrayList<Integer> array;
    protected Scanner sc;
    public LinearSearch(int n, Scanner sc) {
        this.n = n;
        this.sc = sc;
        this.array = new ArrayList<>();
    }

    public void addElements() {
        for (int i = 0; i < n; i++) {
            array.add(sc.nextInt());
        }
    }

    public void run() {
        int indexMinValues = findIndexMinValue(array);
        int indexMaxValue = findIndexMaxValue(array);
        swap(indexMinValues, indexMaxValue);
    }

    private void swap(int indexMinValue, int indexMaxValue) {
        int temp;
        temp = array.get(indexMinValue);
        array.set(indexMinValue, array.get(indexMaxValue));
        array.set(indexMaxValue, temp);
    }

    private int findIndexMaxValue(ArrayList<Integer> array) {
        int result = 0;
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) >= array.get(result)) {
                result = i;
            }
        }
        return result;
    }

    private int findIndexMinValue(ArrayList<Integer> array) {
        int result = 0;
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < array.get(result)) {
                result = i;
                break;
            }
        }
        return result;
    }

    public void showResult () {
        for (int elements : array) {
            System.out.print(elements + " ");
        }
    }
}
