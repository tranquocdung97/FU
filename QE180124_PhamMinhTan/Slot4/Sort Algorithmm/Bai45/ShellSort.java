package Bai45;
class ShellSort {
    private final ArrayManagement arrayManagement;
    public ShellSort(ArrayManagement arrayManagement) {
        this.arrayManagement = arrayManagement;
    }
    public void run() {
        for (int gap = arrayManagement.getSize() / 2; gap > 0 ; gap /= 2) {
            for (int i = gap; i < arrayManagement.getSize(); i++) {
                int j = i - gap;
                if (arrayManagement.getArrayList().get(i) < arrayManagement.getArrayList().get(j)) {
                    swapNum(i, j);
                }
                if (j - gap >= 0) {
                    for (int temp = j; temp - gap >= 0 ; temp -= gap) {
                        if (arrayManagement.getArrayList().get(temp) < arrayManagement.getArrayList().get(temp - gap)) {
                            swapNum(temp, temp - gap);
                        }
                    }
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
