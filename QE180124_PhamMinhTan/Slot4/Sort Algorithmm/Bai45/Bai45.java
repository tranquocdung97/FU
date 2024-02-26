package Bai45;
import java.util.Scanner;

public class Bai45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayManagement arrayManagement = new ArrayManagement(size, sc);
        arrayManagement.addElements();
        ShellSort shellSort = new ShellSort(arrayManagement);
        shellSort.run();
        arrayManagement.showArrayList();
        sc.close();
    }
}
