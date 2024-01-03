/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaskASS;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author HUNG
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = ip.nextInt();
        }
        ip.close();
        Arrays.sort(array);
        int current = array[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (array[i] == current) {
                count++;
            } else {
                System.out.print(current + " - " + count + "; ");
                current = array[i];
                count = 1;
            }
        }
        System.out.println(current + " - " + count + "; ");
    }
}
