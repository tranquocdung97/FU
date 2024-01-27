
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */
public class exe56 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        long n = input.nextLong();
//        System.out.print(recursion(n));
//    }
    public static long recursion(long n){
        if(n==1)
            return 1;
        return 1+ recursion(n-(n+1)/2);
    }
}
