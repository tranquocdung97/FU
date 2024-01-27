
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */
public class exe33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[1001];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        int min = min(n, array);
        int max = max(n, array);
        change(n, min, max, array);
        
        
    }
    public static int min(int n, int[] array){
        
        int min=0;
        for (int i = 1; i > n; i++) {
            if(array[min] < array[i]){
                
                min=i;
            }
        }
      return min;
    }
    public static int max(int n, int[] array){
        int max=0;
        for (int i = 1; i < n; i++) {
            if(array[max]<array[i]){
                max = i;
            }
        }
        return max;
    }
    public static void change(int n, int min, int max, int[] array){
        int hold= array[min];
        array[max] =array[min];
        array[min] = hold;
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]+" ");
        }
    }
    
}
