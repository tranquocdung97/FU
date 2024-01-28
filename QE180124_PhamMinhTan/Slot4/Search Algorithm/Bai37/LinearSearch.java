package Bai37;

public class LinearSearch {
    private final ArrayManagement arrayManagement;
    public LinearSearch(ArrayManagement arrayManagement) {
        this.arrayManagement = arrayManagement;
    }

    public void findSumSeriesEqualTarget(int target) {
        int start = 0, end = 0;
        int currentSum = 0;
        while (end < arrayManagement.getArrayList().size()) {
            if (currentSum == target) {
                arrayManagement.showResult(start, end - 1);
                break;
            } else if (currentSum > target || end == arrayManagement.getArrayList().size() - 1) {
                currentSum -= arrayManagement.getArrayList().get(start);
                start++;
            } else {
                currentSum += arrayManagement.getArrayList().get(end);
                end++;
            }
        }
    }
}
