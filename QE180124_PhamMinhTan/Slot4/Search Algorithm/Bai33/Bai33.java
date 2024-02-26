package Bai33;

import java.util.Scanner;

public class Bai33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinearSearch linearSearch = new LinearSearch(n, sc);
        linearSearch.addElements();
        linearSearch.run();
        linearSearch.showResult();
    }
}
