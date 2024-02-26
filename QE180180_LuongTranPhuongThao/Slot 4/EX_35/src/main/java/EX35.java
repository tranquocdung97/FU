import java.util.Scanner;

public class EX35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap cac phan tu cua mang a:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean found = false;
        for (int i = 0; i < n; i += 2) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("NULL");
        }
    }
}