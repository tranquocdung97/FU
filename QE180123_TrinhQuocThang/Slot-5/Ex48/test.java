import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class test {
	public static String frequency(int[] a) {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i : a)
			map.put(i, map.getOrDefault(i, 0) + 1);
		String result = "";
		for (Entry<Integer, Integer> entry : map.entrySet())
			result += entry.getKey() + " " + entry.getValue() + "; ";
		return result;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scanner.nextInt();
		System.out.println(frequency(arr));
		scanner.close();
	}
}
