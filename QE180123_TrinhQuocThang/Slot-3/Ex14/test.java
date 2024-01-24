import java.util.Scanner;
import java.util.Stack;

public class test {
	public static void toBinary(int n) {
		Stack<Integer> stack = new Stack<Integer>();
		while (n>0)	{
			stack.push(n%2);
			n/=2;
		}
		while (!stack.isEmpty())
			System.out.print(stack.pop());
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		toBinary(n);
		scanner.close();
	}
}
