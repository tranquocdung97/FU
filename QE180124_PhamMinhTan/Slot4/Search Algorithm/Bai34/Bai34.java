package Bai34;

import java.util.Scanner;

public class Bai34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinearSearch linearSearch = new LinearSearch(sc, n);
        linearSearch.addElements();
        int target = sc.nextInt();
        System.out.println(linearSearch.countFrequency(target));
    }
}
