import java.util.ArrayList;
import java.util.List;

public class Graph {
    private boolean[] b;
    private boolean[][] a;
    private boolean kt;

    public boolean check(int n, List<List<Integer>> e, int u, int v) {
        b = new boolean[n + 1];
        a = new boolean[n + 1][n + 1];
        kt = false;

        for (int i = 0; i <= n; i++) {
            b[i] = true;
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                a[i][j] = false;
            }
        }

        for (List<Integer> edge : e) {
            int x = edge.get(0);
            int y = edge.get(1);
            a[x][y] = true;
        }

        dfs(u, v, n);
        return kt;
    }

    private void dfs(int u, int v, int n) {
        b[u] = false;

        for (int i = 1; i <= n; i++) {
            if (a[u][i] && b[i]) {
                if (i == v) {
                    kt = true;
                }
                dfs(i, v, n);
                b[i] = true;
            }
        }
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

        Graph graph = new Graph();
        boolean pathExists = graph.check(n, edges, u, v);
        System.out.println("Path exists: " + pathExists);
    }
}