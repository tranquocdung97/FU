package Bai36;

import java.util.Scanner;
public class Bai36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BinarySearch binarySearch = new BinarySearch(n, sc);
        binarySearch.addElements();
        int target = sc.nextInt();
        System.out.println(binarySearch.run(target));
    }
}
