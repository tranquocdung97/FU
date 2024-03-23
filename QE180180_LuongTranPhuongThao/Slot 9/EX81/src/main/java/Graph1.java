import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph1 {
    private boolean[] b;
    private int[] c;
    private boolean[][] a;

    public int graphFunction(int n, List<List<Integer>> e, int u, int v) {
        b = new boolean[n + 1];
        c = new int[n + 1];
        a = new boolean[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            b[i] = true;
            c[i] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = false;
            }
        }

        for (List<Integer> edge : e) {
            int x = edge.get(0);
            int y = edge.get(1);
            a[x][y] = true;
            a[y][x] = true;
        }

        int k = bfs(u, v, n);
        return (k == 0) ? -1 : k;
    }

    private int bfs(int u, int v, int n) {
        int kq = n + 1;
        Queue<Integer> q = new LinkedList<>();
        q.add(u);
        b[u] = false;

        while (!q.isEmpty()) {
            int k = q.poll();

            for (int i = 1; i <= n; i++) {
                if (a[k][i] && b[i]) {
                    c[i] = c[k] + 1;
                    b[i] = false;
                    q.add(i);
                    if (i == v) {
                        break;
                    }
                }
            }
        }

        return c[v];
    }

    public static void main(String[] args) {
       
        int n = 5;
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(List.of(1, 2));
        edges.add(List.of(2, 3));
        edges.add(List.of(3, 4));
        edges.add(List.of(4, 5));

        int u = 1;
        int v = 5;

        Graph1 graph = new Graph1();
        int shortestDistance = graph.graphFunction(n, edges, u, v);
        System.out.println("Shortest distance: " + shortestDistance);
    }
}