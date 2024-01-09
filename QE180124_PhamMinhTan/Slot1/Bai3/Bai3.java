import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int currentElement = sc.nextInt();
            int squared = currentElement*currentElement;
            a[i] = squared;
        }
        for (int arraySquared : a) {
            System.out.print(arraySquared + " ");
        }
    }
}
