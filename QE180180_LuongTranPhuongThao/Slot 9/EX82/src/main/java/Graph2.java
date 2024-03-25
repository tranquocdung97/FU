import java.util.ArrayList;
import java.util.List;

public class Graph2 {
    private boolean[] b;
    private boolean[][] a;
    private int M = -1;

    public int graphFunction(int n, List<List<Integer>> e, int u, int v) {
        b = new boolean[n + 1];
        a = new boolean[n + 1][n + 1];
        M = -1;

        for (int i = 0; i <= n; i++) {
            b[i] = true;
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

        dfs(u, v, n, 0);
        return M;
    }

    private void dfs(int u, int v, int n, int count) {
        b[u] = false;

        for (int i = 1; i <= n; i++) {
            if (a[u][i] && b[i]) {
                if (i == v) {
                    if (count + 1 > M) {
                        M = count + 1;
                        break;
                    }
                }
                dfs(i, v, n, count + 1);
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

        Graph2 graph = new Graph2();
        int maxLength = graph.graphFunction(n, edges, u, v);
        System.out.println("Maximum length: " + maxLength);
    }
}