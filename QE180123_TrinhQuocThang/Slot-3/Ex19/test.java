import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			if (!queue.contains(x))
				queue.add(x);
		}
		int k = scanner.nextInt();
		while (queue.size()>k)
			queue.poll();
		while (!queue.isEmpty())
			System.out.print(queue.poll() + " ");
		scanner.close();
	}
}