
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */
public class exe52 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        long n=input.nextInt();
//        System.out.print(Recursion(n));
//    }
    public static long Recursion(long n){
        if(n==0)
            return 1;
        return n*Recursion(n-1);
    }
}
