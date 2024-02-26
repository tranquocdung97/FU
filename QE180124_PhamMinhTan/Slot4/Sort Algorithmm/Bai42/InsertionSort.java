package Bai42;

class InsertionSort {
    private  ArrayManagement arrayManagement;

    public InsertionSort(ArrayManagement arrayManagement) {
        this.arrayManagement = arrayManagement;
    }

    public void run() {
        for (int i = 1; i < arrayManagement.getArrayList().size(); i++) {
            int j = i - 1;
            while (j >= 0 && arrayManagement.getArrayList().get(j + 1) < arrayManagement.getArrayList().get(j)) {
                swapNum(j+1, j);
                j--;
            }
        }
    }

    private void swapNum(int num1, int num2) {
        int temp;
        temp = arrayManagement.getArrayList().get(num1);
        arrayManagement.getArrayList().set(num1, arrayManagement.getArrayList().get(num2));
        arrayManagement.getArrayList().set(num2, temp);
    }
}
