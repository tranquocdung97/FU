
package Slot2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bt18 {
	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		else {
			for (int i = 2; i <= Math.sqrt(n); i++)
				if (n % i == 0)
					return false;
		}
		return true;
	}

	public static boolean isSuperPrime(int n) {
		if (n == 0)
			return true;
		else
			return isPrime(n) && isSuperPrime(n / 10);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		int n = scanner.nextInt();
		for (int i = 2; i < n && i < 10; i++)
			if (isPrime(i))
				queue.add(i);
		while (!queue.isEmpty()) {
			for (int i = 1; i <= 9; i++)
				if (queue.peek() * 10 + i < n && isPrime(queue.peek() * 10 + i))
					queue.add(queue.peek() * 10 + i);
			System.out.print(queue.poll() + " ");
		}
		scanner.close();
	}
}
