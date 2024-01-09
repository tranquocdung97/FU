/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b25;
import java.util.*;
/**
 *
 * @author PHUC
 */
public class B25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        LinkedList<Integer> List = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int num = s.nextInt();
            List.add(num);
        }
        int a = s.nextInt();
        int b = s.nextInt();
        ListIterator<Integer> doi = List.listIterator();
        while (doi.hasNext()) {
            int v = doi.next();
            if (v == a) {
                doi.set(b);
            }
        }
        for (int num : List) {
            System.out.print(num + " ");
        }
    }
}