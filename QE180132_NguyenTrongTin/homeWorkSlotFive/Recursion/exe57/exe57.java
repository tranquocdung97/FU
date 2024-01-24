
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */
public class exe57 {//doc lai di stupid//
   static int count=0;
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int k = input.nextInt();
//        recursion(n, k);
//        System.out.println(count);
//    }
    public static void recursion(int n,int k){
        if(k==0){
            count-=-1;
        }else{
            recursion(2*n, k-1);
            if((n-1)%3 == 0 && ((n-1)/3)%2==1)
                recursion((n-1)/3, k-1);
        }
           
    }
}
