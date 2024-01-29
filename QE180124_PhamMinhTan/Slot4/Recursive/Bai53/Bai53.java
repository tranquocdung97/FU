package Bai53;

import java.util.Scanner;

public class Bai53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        int b = sc.nextInt();
        int result = aExponentialb(a, b);
        System.out.println(result);
        sc.close();
    }

    private static int aExponentialb(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * aExponentialb(a, b - 1);
    }
}
