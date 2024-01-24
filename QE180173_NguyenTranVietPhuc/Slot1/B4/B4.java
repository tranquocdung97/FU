/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b4;

import java.util.*;

public class B4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arrL = new ArrayList<Integer>();
        int arrSize = in.nextInt();

        for (int index = 0; index < arrSize; ++index) arrL.add(in.nextInt());
        arrL.remove(in.nextInt());
        
        for (int index = 0; index < arrL.size(); ++index) {
            System.out.print(arrL.get(index) + " ");
        }
    }
}