import java.util.Scanner;

public class Main {
    private static int[] a = new int[11];
    private static boolean[] b = new boolean[11];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            b[i] = true;
        }
        recursion(1, n);
    }

    private static void recursion(int k, int n) {
        for (int i = 1; i <= n; i++) {
            if(b[i]){
                a[k] = i;
                if (k==n){
                    printArray(a, n);
                } else {
                    b[i] = false;
                    recursion(k+1, n);
                    b[i] = true;
                }
            }
        }
    }

    private static void printArray(int[] a, int n){
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }
}
