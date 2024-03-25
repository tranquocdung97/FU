package Slot8;

import java.util.Scanner;

public class Bai77 {
    public class LongestPalindrome {

        public static String longestPalindrome(String s) {
            String x = s;
            String y = new StringBuilder(x).reverse().toString();
            int m = x.length(), n = y.length();
            x = " " + x;
            y = " " + y;
            int[][] l = new int[m + 1][n + 1];

            for (int i = 1; i <= m; i++)
                for (int j = 1; j <= n; j++) {
                    if (x.charAt(i) == y.charAt(j))
                        l[i][j] = l[i - 1][j - 1] + 1;
                    else
                        l[i][j] = Math.max(l[i - 1][j], l[i][j - 1]);
                }

            StringBuilder p = new StringBuilder();
            while (l[m][n] > 0 && m > 0 && n > 0) {
                while (l[m - 1][n] == l[m][n])
                    m--;
                while (l[m][n] == l[m][n - 1])
                    n--;
                p.insert(0, x.charAt(m));
                m--;
                n--;
            }
            return p.toString();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            System.out.println(longestPalindrome(s));
            scanner.close();
        }
    }
}
