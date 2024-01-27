
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */
public class exe54 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int m = input.nextInt();
//        System.out.print(recursion(n, m));
//    }
    public static long recursion( long a, long b  ){
        if(b==0)
            return a;
        if(a%b==0)
            return b;
        
        return recursion(b, a%b);
    }
}
