package Bai38;

public class LinearSearch {
    private final ArrayManagement arrayManagement;
    public LinearSearch(ArrayManagement arrayManagement) {
        this.arrayManagement = arrayManagement;
    }

    public int run(int target) {
        for (int i = 0; i < arrayManagement.getArrayList().size(); i++) {
            if (arrayManagement.getArrayList().get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
