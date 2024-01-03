/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b7;

import java.util.Scanner;

public class B7 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean check = true;
        if (n > 2){
            for (int i = 2; i < n; i++)
                if ((a[i] - a[i-1]) * (a[i-1] - a[i-2]) <=0)
                    check = false;
        }
        if (check)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}
