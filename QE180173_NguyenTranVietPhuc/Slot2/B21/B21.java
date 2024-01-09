/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b21;
import java.util.*;
/**
 *
 * @author PHUC
 */


public class B21{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        LinkedList<Integer> List = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int num = s.nextInt();
            List.add(num);
        }

        for (int num : List) {
            System.out.print(num + " ");
        }
    }
}
