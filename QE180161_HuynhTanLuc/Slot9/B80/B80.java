
package b80;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class B80 {

    static Queue<Integer> queue = new LinkedList<>();

    static boolean check(int n, int[][] e, int u, int v) {
        queue.add(u);
        while (!queue.isEmpty() && !queue.contains(v)) {
            int front = queue.poll();
            for (int i = 0; i < e.length; i++) {
                if (front == e[i][0] && !queue.contains(e[i][1])) {
                    queue.offer(e[i][1]);
                }
            }
        }
        return !queue.isEmpty() && queue.contains(v);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] edges = new int[m][2];
        for (int i = 0; i < m; i++) {
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();
        }
        int u = scanner.nextInt();
        int v = scanner.nextInt();
        System.out.println(check(n, edges, u, v));
    }
    
}
