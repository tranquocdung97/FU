
package Slot2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bt17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++)
			queue.add(scanner.nextInt());
		int k = scanner.nextInt();
		for (int i = 0; i < k; i++)
			queue.add(queue.poll());
		while (!queue.isEmpty())
			System.out.print(queue.poll() + " ");
		scanner.close();
	}
}
