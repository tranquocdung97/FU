/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot8;
    import java.util.Scanner;
/**
 *
 * @author HUNG
 */
public class Ex77 {
    public static String longestChainSymmetry(String s) {
        String x = s;
        StringBuilder y = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--)
            y.append(x.charAt(i));
        int m = x.length(), n = y.length();
        x = " " + x;
        y = new StringBuilder(" " + y);
        int[][] l = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++)
            l[i][0] = 0;
        for (int j = 0; j <= n; j++)
            l[0][j] = 0;
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
        System.out.println(longestChainSymmetry(s));
    }
}

