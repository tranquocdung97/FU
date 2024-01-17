
import java.util.Scanner;

public class exe36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[1001];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        int x = input.nextInt();
        System.out.print(BNRsearch(array, n, x));
    }

    public static int BNRsearch(int[] array, int n, int x) {
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int mid = (r + l) / 2;
            if (array[mid] < x) {
                l = mid + 1; // Thay doi o day
            } else {
                r = mid;
            }
        }
        if (array[l] == x)
            return l;
        return -1;
    }
}