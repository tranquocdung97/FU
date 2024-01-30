package b60;

import java.util.Scanner;

public class B60 {

    private static void combination(int[] arr, int k,int start, String current) {
        if (k == 0) {           
                System.out.print(current + " ");            
        } else
            for (int i = start; i < arr.length; i++) {
                combination(arr, k - 1, i + 1, current + arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        combination(arr, k, 0, "");
    }

}
