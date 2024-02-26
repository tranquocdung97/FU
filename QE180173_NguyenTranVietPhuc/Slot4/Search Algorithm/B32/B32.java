/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b32;
import java.util.Scanner;
public class B32{
    private static int FirstIndex(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        for (int i = 0; i < n; i ++){
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int FirstIndex = FirstIndex();
        System.out.print(FirstIndex);
    }
}