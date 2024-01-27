
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */
public class exe32 {
    public static void main(String[] args) {
        
    int[] array = new int[1001];
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            array[i]= input.nextInt();
        }
        int m =input.nextInt();
        System.out.println(search(m, array, n));

  }
    public static int search(int m, int[] array, int n){
       for (int i = 0; i < n; i++) {
            if(array[i]== m){
                return i;
            }
        }
        return -1;
    }
}
