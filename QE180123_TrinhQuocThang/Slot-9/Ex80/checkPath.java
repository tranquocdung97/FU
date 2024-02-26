import java.util.LinkedList;
import java.util.Queue;

public class checkPath {

	// BFS
	static boolean check(int n, int[][] e, int u, int v) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(u);
		while (!queue.isEmpty() && !queue.contains(v)) {
			int temp = queue.poll();
			for (int i = 0; i < e.length; i++) {
				if (temp == e[i][0] && !queue.contains(e[i][1])) {
					queue.offer(e[i][1]);
				}
			}
			System.out.println(queue.toString());

		}
		return !queue.isEmpty() && queue.contains(v);
	}

	public static void main(String[] args) {
		int[][] edges1 = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 } };

		int[][] edges2 = { { 1, 2 }, { 3, 4 }, { 2, 4 } };

		int u1 = 1;
		int v1 = 5;

		int u2 = 1;
		int v2 = 3;
		System.out.println(check(5, edges1, u1, v1)); 
		System.out.println(check(3, edges2, u2, v2)); 

	}
}
