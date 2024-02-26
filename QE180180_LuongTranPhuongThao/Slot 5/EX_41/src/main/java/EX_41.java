import java.util.Scanner;
import java.util.Arrays;

public class EX_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap cac phan tu cua mang a:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Day so a:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}