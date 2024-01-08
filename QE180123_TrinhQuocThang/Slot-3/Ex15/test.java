import java.util.Scanner;
import java.util.Stack;

public class test {
	public static void encodeString(String s) {

		Stack<Character> stack = new Stack<Character>();
		stack.add(s.charAt(0));
		int count = 1;
		for (int i = 1; i < s.length(); i++) {
			if (stack.peek().equals(s.charAt(i)))
				count++;
			else {
				System.out.print(stack.pop());
				System.out.print(count);
				count = 1;
				stack.push(s.charAt(i));
			}
		}
		if (!stack.isEmpty())	{
			System.out.print(stack.pop());
			System.out.print(count);
		}
			
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		encodeString(str);
		scanner.close();
	}
}
