import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        boolean ascending = true;
        boolean descending = true;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[n];
        addElements (a, sc);
        if (ascending(a) || descending(a)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static void addElements(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    private static boolean descending(int[] a) {
        for (int i = 0; i<a.length-1; i++) {
            if (a[i] < a[i+1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean ascending(int[] a) {
        for (int i = 0; i<a.length-1; i++) {
            if (a[i] > a[i+1]) {
                return false;
            }
        }
        return true;
    }
}
