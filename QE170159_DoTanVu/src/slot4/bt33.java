
package slot4;
import java.util.Scanner;

public class bt33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Nhap day so
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Tim vi tri cua phan tu nho nhat va lon nhat
        int minIndex = 0, maxIndex = 0;
        int minValue = arr[0], maxValue = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
            if (arr[i] >= maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }

        // Hoan doi phan tu nho nhat va lon nhat
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;

        // In day sau khi hoan doi
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
