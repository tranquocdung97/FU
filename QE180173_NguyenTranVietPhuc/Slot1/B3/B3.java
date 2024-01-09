/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b3;

import java.util.*;

public class B3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arrL = new ArrayList<Integer>();
        int arrSize = in.nextInt();

        for (int i = 0; i < arrSize; ++i) arrL.add(in.nextInt());
        arrL.add(in.nextInt(), in.nextInt());
        for (int i = 0; i <= arrSize; ++i) {
            System.out.print(arrL.get(i) + " ");
        }
    }
}