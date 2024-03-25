
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MY MSI
 */
public class exe73 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        int x = input.nextInt();
        System.out.println(solve(array, 0, n - 1, x));
    }

    public static int solve(int[] array, int l, int r, int x) {
        if (l == r) {
            if (array[l] == x) {
                return 1;
            }
            return 0;
        } else {
            int m = (l + r) / 2;   
            return solve(array, l, m, x) + solve(array, m + 1, r, x);
        }
    }  
}
