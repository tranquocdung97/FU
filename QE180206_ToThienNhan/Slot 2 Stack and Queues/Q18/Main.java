import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int n;
        n = scanner.nextInt();

        for (int i = 2; i <= n && i < 10; i++) {
            if (isPrime(i)) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int front = q.poll();
            System.out.print(front + " ");

            for (int i = 1; i <= 9; i++) {
                int k = front * 10 + i;
                if (k <= n && isPrime(k)) {
                    q.add(k);
                }
            }
        }
    }
}
