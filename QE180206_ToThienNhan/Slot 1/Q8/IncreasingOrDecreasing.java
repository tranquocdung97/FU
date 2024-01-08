import java.util.Scanner;

public class IncreasingOrDecreasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int prev = scanner.nextInt();

        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 1; i < n; i++) {
            int current = scanner.nextInt();

            if (current > prev) {
                isDecreasing = false;
            } else if (current < prev) {
                isIncreasing = false;
            }

            prev = current;
        }

        if (isIncreasing || isDecreasing) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
