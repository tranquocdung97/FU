package Bai56;

import java.util.Scanner;

public class Bai56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(gameGuessNumber(n));
        sc.close();
    }

    private static int gameGuessNumber(long n) {
        if (n <= 1) {
            return 1;
        }
        return 1 + gameGuessNumber(n / 2);
    }
}
