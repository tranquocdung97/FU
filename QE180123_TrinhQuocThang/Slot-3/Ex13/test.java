import java.util.Scanner;
import java.util.Stack;

public class test {
	public static void reverseString(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i =0; i<s.length();i++)
			stack.add(s.charAt(i));
		while (!stack.isEmpty())
			System.out.print(stack.pop());
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		reverseString(str);
		scanner.close();
	}
}
