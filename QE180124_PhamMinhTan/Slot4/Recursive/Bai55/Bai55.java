package Bai55;

import java.util.Scanner;

public class Bai55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findNInFibonacci(n));
        sc.close();
    }

    private static int findNInFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return findNInFibonacci(n - 1) + findNInFibonacci(n - 2);
    }
}
