
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */
public class exe34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        int[] array = new int[1001];
        for (int i = 0; i < n; i++) {
            array[i]=input.nextInt();
        }
        int m = input.nextInt();
        int count =0;
        for (int i = 0; i < n; i++) {
            if(array[i] == m){
            count+=1;
        }
        }
        System.out.print(count);
    }
  
}
