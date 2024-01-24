
package b37;

import java.util.Scanner;

public class B37 {
    
    public static void findSubArray(int[] arr, int n, int s) {
        int start = 0, end = 0, currSum = 0;
        while (end <= n) {
            if (currSum == s) {
                printSubArray(arr, start, end);
                return;
            }
            if (currSum < s && end <= n) {
                currSum += arr[end++];
            } else {
                currSum -= arr[start++];
            }
        }
        System.out.println("-1");
    }
    
    public static void printSubArray(int[] arr, int start, int end) {
        for (int i = start; i < end; i++){
            System.out.print(arr[i] + " ");
        }      
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int s = sc.nextInt();
        findSubArray(arr, n, s);
    }
    
}
