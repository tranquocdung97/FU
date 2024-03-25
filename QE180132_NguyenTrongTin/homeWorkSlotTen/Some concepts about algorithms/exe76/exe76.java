/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */
import java.util.Scanner;

public class exe76 {
    static int[][] s = new int[10001][2];
    static int[] a = new int[10001];

    static int chooseGifts(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            s[i][0] = a[i];
            s[i][1] = -1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[j] == a[i] && s[j][0] + a[i] > s[i][1]) {
                    s[i][1] = s[j][0] + a[i];
                }
                if (s[j][1] + a[i] > s[i][0]) {
                    s[i][0] = s[j][1] + a[i];
                }
            }
        }
        int max = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                if (s[i][j] > max) {
                    max = s[i][j];
                }
            }
        }
        return max;
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            a[i] = scanner.nextInt();
//        }
//        System.out.println(chooseGifts(a, n));
//    }
}
