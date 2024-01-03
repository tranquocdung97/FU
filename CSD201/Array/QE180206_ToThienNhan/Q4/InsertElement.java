import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[100];
        int n, k, x;

        System.out.print("Enter the size of the array: ");
        n = scanner.nextInt();

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Enter the position to insert (k): ");
        k = scanner.nextInt();

        System.out.print("Enter the value to insert (x): ");
        x = scanner.nextInt();

        for (int i = n; i >= k + 1; i--) {
            a[i] = a[i - 1];
        }

        a[k] = x;
        n++;

        System.out.println("Array after inserting the element:");
        printArray(a, n);

        scanner.close();
    }

    private static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
