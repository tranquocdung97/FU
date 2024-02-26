package Bai41;

class BubbleSort {
    private ArrayManagement arrayManagement;
    public BubbleSort(ArrayManagement arrayManagement) {
        this.arrayManagement = arrayManagement;
    }

    public void run() {
        for (int i = 0; i < arrayManagement.getArrayList().size() - 1; i++) {
            for (int j = 0; j < arrayManagement.getArrayList().size() - i - 1; j++) {
                if (arrayManagement.getArrayList().get(j + 1) < arrayManagement.getArrayList().get(j)) {
                    swapNum(j + 1, j);
                }
            }
        }
    }

    private void swapNum(int nextNum, int num) {
        int temp;
        temp = arrayManagement.getArrayList().get(nextNum);
        arrayManagement.getArrayList().set(nextNum, arrayManagement.getArrayList().get(num));
        arrayManagement.getArrayList().set(num, temp);
    }
}
