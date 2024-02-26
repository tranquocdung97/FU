import java.util.Scanner;

public class EX33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap phan tu mang a:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int minIndex = 0;
        int minValue = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < minValue) {
                minValue = a[i];
                minIndex = i;
            }
        }
        int maxIndex = n - 1;
        int maxValue = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > maxValue) {
                maxValue = a[i];
                maxIndex = i;
            }
        }
        int temp = a[minIndex];
        a[minIndex] = a[maxIndex];
        a[maxIndex] = temp;
        System.out.println("Day sau khi hoan doi:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}