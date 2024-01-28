package Bai38;

import java.util.Scanner;

public class Bai38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayManagement arrayManagement = new ArrayManagement(n, sc);
        arrayManagement.addElements();
        int target = sc.nextInt();
        LinearSearch linearSearch = new LinearSearch(arrayManagement);
        System.out.println(linearSearch.run(target));
        sc.close();
    }
}
