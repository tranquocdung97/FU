package Bai37;

import java.util.Scanner;

public class Bai37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayManagement arrayManagement = new ArrayManagement(n, sc);
        arrayManagement.addElements();
        int target = sc.nextInt();
        sc.nextLine();
        LinearSearch linearSearch = new LinearSearch(arrayManagement);
        linearSearch.findSumSeriesEqualTarget(target);
        sc.close();
    }
}
