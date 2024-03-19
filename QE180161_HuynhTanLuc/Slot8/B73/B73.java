
package b73;

import java.util.Scanner;

public class B73 {

    public static int count(int[] arr, int l, int r, int x) {
        if (l == r) {
            if (arr[l] == x) 
                return 1;
            else return 0;
        } else {
            int m = (l+r)/2;
            return count(arr, l, m, x) + count(arr, m+1, r, x);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(count(arr, 0, n-1, x));
    }
    
}
