import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[n];
        int[] b = new int[n-1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < k; i++) {
            b[i] = a[i];
            count++;
        }
        for (int i = count; i < b.length; i++) {
            b[i] = a[i+1];
        }
        for (int element : b) {
            System.out.print(element + " ");
        }
    }
}