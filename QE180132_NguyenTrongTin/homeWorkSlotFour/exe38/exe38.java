
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */
public class exe38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        int x=input.nextInt();
        System.out.print(interPolationSearch(array, n, x));
    }
    public static int interPolationSearch(int[] array, int n, int x){
        int l=0,r = n-1;
        while(array[r] != array[l] && x >= array[l] && x<= array[r]){
            int mid = 1 + (r-1)*(x-array[l])/(array[r]-array[l]);
            if(array[mid] < x){
                l = mid +1;
            }else if(array[mid] > x){
                r = mid -1;
            }else{
                if(mid > 0 && array[mid-1]  == x){
                    r = mid -1;
                }else{
                    return mid;
                }
            }
        
        }
        if(array[l] == x)
            return l;
        return -1;
    }
}
