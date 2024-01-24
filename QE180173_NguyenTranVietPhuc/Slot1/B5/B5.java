/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b5;

import java.util.Scanner;
public class B5{
    public static boolean checkNumber(int n){
        if(n==0 || n==1) return false;
        for(int i= 2;i<= n/2; i++){
            if(n % i ==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[100];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n;i++){
            if(checkNumber(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }
    }
}