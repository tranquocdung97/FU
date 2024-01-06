import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[n];
        int[] b = new int[n];
        a = addElements(a, sc);
        a = sortedElements(a);
        b = countOccurrences(a, b);
        printArray(a, b);
    }

    private static int[] countOccurrences(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            b[i] = count;
        }
        return b;
    }

    private static void printArray(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i == 0 || a[i] != a[i - 1]) {
                System.out.print(a[i] + " - " + b[i] + "; ");
            }
        }
    }

    private static int[] addElements(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    private static int[] sortedElements(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    a = swapNum(a, j, j + 1);
                }
            }
        }
        return a;
    }

    private static int[] swapNum(int[] a, int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
}
