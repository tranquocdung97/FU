import java.util.Scanner;

import java.util.*;

public class Main {
    static boolean[] b = new boolean[100001];
    static boolean[][] a = new boolean[1001][1001];
    static int M = -1;

    static void dfs(int u, int v, int n, int count) {
        b[u] = true;
        for (int i = 1; i <= n; i++) {
            if (b[i]) continue;
            if (a[u][i]) {
                if (i == v && count + 1 > M) {
                    M = count + 1;
                }
                dfs(i, v, n, count + 1);
            }
        }
        b[u] = false;
    }

    public static int graphFunction(int n, List<List<Integer>> e, int u, int v) {
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

    public static void main(String[] args) {
        // Example usage
        int n = 4;
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(Arrays.asList(1, 2));
        edges.add(Arrays.asList(2, 3));
        edges.add(Arrays.asList(3, 4));
        int u = 1;
        int v = 4;
        int result = graphFunction(n, edges, u, v);
        System.out.println("Longest path length between " + u + " and " + v + " is: " + result);
    }
}
