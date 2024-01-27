
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */
public class exe37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=input.nextInt();
        }
        int[] find = new int[n];
        int s= input.nextInt();
        boolean k = solve(array, find, n, s);
        if(!k)
            System.out.print("-1");
    }
    public static boolean solve(int[] array,int[] find, int n, int s){
        find[0]=array[0];
        for (int i = 1; i < n; i++) {
            find[i]=find[i-1]+array[i];
        }
        for(int i=0;i<n;i++){
            if(find[i] == s){
                printArray(array,0, i);
                return true;
            }
            if(find[i] > s){
                int l = BNRsearch(find, n, find[i]-s);
                if(l != -1){
                    printArray(array, l+1, i);
                    return true;
                }
            }
        }
        return true;
    }
    public static void printArray(int[] array, int l, int r){
        for (int i = l; i < r; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static int BNRsearch(int[] array, int n, int x) {
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int mid = (r + l) / 2;
            if (array[mid] < x) {
                l = mid + 1; // Thay đổi ở đây
            } else {
                r = mid;
            }
        }
        if (array[l] == x)
            return l;
        return -1;
    }

}
