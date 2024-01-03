/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaskASS;
import java.util.Scanner;
/**
 *
 * @author HUNG
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = ip.nextInt();
        }
        int k = ip.nextInt();
        int x = ip.nextInt();
        ip.close();
        int[] newArray = new int[n + 1];
        for (int i = 0; i < k; i++) {
            newArray[i] = array[i];
        }
        newArray[k] = x;
        for (int i = k + 1; i < n + 1; i++) {
            newArray[i] = array[i - 1];
        }
        for (int i = 0; i < n + 1; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}