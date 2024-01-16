
package b36;

import java.util.Scanner;

public class B36 {
    
    public static int binarySearch(int[] arr, int n, int x) {
        int l = 0, r = n -1;
        while (l < r){
            int mid = (l + r) / 2;            
            if (arr[mid] < x)
                l = mid + 1;
            else
                r = mid
                        ;
        }       
        if (arr[l] == x) {
                return l;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        int x = sc.nextInt();
        System.out.println(binarySearch(arr, n, x));
    }
    
}
