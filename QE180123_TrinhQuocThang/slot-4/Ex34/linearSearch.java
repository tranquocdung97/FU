import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class linearSearch {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			list.add(scanner.nextInt());
		int x = scanner.nextInt();
		int index = 0;
		while (list.contains(x)) {
			index++;
			list.remove(list.indexOf(x));
		};
		System.out.println(index);
		scanner.close();
	}
}
