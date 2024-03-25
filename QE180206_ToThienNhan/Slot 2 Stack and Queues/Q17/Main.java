import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            queue.add(temp);
        }

        int k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            int x = queue.poll();
            queue.add(x);
        }

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}