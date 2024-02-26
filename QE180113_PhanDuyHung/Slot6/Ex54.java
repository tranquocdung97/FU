/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot6;
import java.util.Scanner;
/**
 *
 * @author HUNG
 */
public class Ex54 {
    public static int UCLN(int k, int a){
    while (a*k != 0){ 
        if (a > k){
            a %= k; 
        }else{
            k %= a;
        }
    }
    return a + k; 
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int k = ip.nextInt();
        int a = ip.nextInt();
       UCLN(k,a);
        System.out.println(UCLN(k,a));
    }
}
