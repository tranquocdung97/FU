package Bai14;

import java.util.ArrayList;

class ConvertDecToBin {
    private ArrayList stackArray;

    public ConvertDecToBin() {
        this.stackArray = new ArrayList<>();
    }

    public void push(int num) {
        stackArray.add(num);
    }

    public int pop() {
        if (!stackArray.isEmpty()) {
            int poppedValue =  (int) stackArray.get(stackArray.size() - 1);
            stackArray.remove(stackArray.size() - 1);
            return poppedValue;
        }
        return -1;
    }

    public boolean zeroCase(int n) {
        return n == 0;
    }

    public void calculateRemainder(int n) {
        while (n != 0) {
            push((n % 2));
            n /= 2;
        }
    }

    public void showResult(int n) {
        calculateRemainder(n);
        if (zeroCase(n)){
            System.out.println("0");
        } else {
            while (!stackArray.isEmpty()){
                System.out.print(pop());
            }
        }
    }
}
