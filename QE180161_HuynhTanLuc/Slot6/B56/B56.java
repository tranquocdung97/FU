/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b56;

import java.util.Scanner;

public class B56 {
    
    public static int gameGuestNumber(long n) {
        if (n == 1)
            return 1;
        return 1 + gameGuestNumber(n - (n + 1)/2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(gameGuestNumber(n));
    }
    
}
