import java.util.Scanner;

public class EX34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap cac phan tu cua mang a:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Nhap so nguyen x: ");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                count++;
            }
        }
        System.out.println("So lan xuat hien cua x trong mang a: " + count);
    }
}