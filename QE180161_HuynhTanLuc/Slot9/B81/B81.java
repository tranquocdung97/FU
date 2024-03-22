package b81;
import java.util.*;

public class B81 {
    public static int graphFunction(int n, List<List<Integer>> e, int u, int v) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] b = new boolean[n + 1];
        int[] degree = new int[n + 1];
        q.add(u);
        b[u] = true;
        degree[u] = 0;
        while (!q.isEmpty()) {
            int x = q.poll();
            for (int i = 0; i < e.size(); i++) {
                if (x == e.get(i).get(0) && !b[e.get(i).get(1)]) {
                    q.add(e.get(i).get(1));
                    b[e.get(i).get(1)] = true;
                    degree[e.get(i).get(1)] = degree[x] + 1;
                    if (e.get(i).get(1) == v) return degree[v];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int connections = scanner.nextInt();

        List<List<Integer>> e = new ArrayList<>();
        for (int i = 0; i < connections; i++) {
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            e.add(Arrays.asList(src, dest));
        }

        int u = scanner.nextInt();
        int v = scanner.nextInt();

        int result = graphFunction(n, e, u, v);
        System.out.println(result);

        scanner.close();
    }
}
