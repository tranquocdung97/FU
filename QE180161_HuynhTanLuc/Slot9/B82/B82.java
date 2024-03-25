public class LongestPath {

	static int[][] arr = new int[1000][1000];
	static int[] b = new int[1000];

	public static int graphFunction(int n, int[][] a, int u, int v) {
		if (u == v)
			return 0;
		b[u] = 1;

		for (int[] x : a) {
			arr[x[0]][x[1]] = 1;
			arr[x[1]][x[0]] = 1;
		}

		int max = -1;
		for (int i = 1; i <= n; i++) {
			if (arr[u][i] == 1 && b[i] == 0) {
				int qd = graphFunction(n, a, i, v);
				if (qd > max)
					max = qd;
			}
		}

		if (max > -1)
			return max + 1;
		else
			return -1;
	}

	public static void main(String[] args) {
		int n = 6;
		int[][] edges = { { 1, 3 }, { 1, 2 }, { 2, 3 }, { 3, 4 }, { 2, 5 }, { 4, 6 }, { 6, 5 }, { 4, 5 } };

		int u = 1, v = 5;

		int result = graphFunction(n, edges, u, v);
		System.out.println(result);
	}
}