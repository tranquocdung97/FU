/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b71;
import java.util.Scanner;
/**
 *
 * @author PHUC
 */
import java.util.Arrays;
public class B71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int earliestBloomDay = findEarliestBloomDay(a);
        System.out.println(earliestBloomDay);
    }
    public static int findEarliestBloomDay(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        int earliestBloomDay = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] > earliestBloomDay) {
                break;
            }
            earliestBloomDay++;
        }
        return earliestBloomDay;
    }
}
