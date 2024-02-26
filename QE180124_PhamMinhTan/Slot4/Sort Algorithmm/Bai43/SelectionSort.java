package Bai43;

class SelectionSort {
    private final ArrayManagement arrayManagement;
    public SelectionSort(ArrayManagement arrayManagement) {
        this.arrayManagement = arrayManagement;
    }

    public void run() {
        for (int i = 0; i < arrayManagement.getArrayList().size() - 1; i++) {
            for (int j = i + 1; j < arrayManagement.getArrayList().size(); j++) {
                if (arrayManagement.getArrayList().get(j) < arrayManagement.getArrayList().get(i)) {
                    swapNum(j, i);
                }
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
