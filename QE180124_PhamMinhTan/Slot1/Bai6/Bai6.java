import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        boolean valid = true;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[n];
        int[] b = new int[n];
        inputElements(a, sc);
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                b[i] = a[i];
            }
        }
        printResult(b);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }

    private static void printResult(int[] b) {
        for (int element : b) {
            if (element != 0) {
                System.out.print(element + " ");
            }
        }
    }

    private static void inputElements(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }
}
