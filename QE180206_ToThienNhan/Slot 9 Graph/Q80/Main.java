package seftCode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static boolean check(int[][] edge, int start, int end) {
        Queue<Integer> queue = new LinkedList<Integer> ();
        queue.add (start);
        int temp;
        while (!queue.isEmpty () && !queue.contains (end)) {
            temp = queue.poll ();
            for (int i = 0; i < edge.length; i++) {
                if (temp == edge[i][0] && !queue.contains (edge[i][1])) {
                    queue.offer (edge[i][1]);
                }
            }
            System.out.println (queue.toString ());
        }
        return !queue.isEmpty () && queue.contains (end);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter row with (column is 5)");
        int m = scanner.nextInt ();
        int[][] edge = new int[1000][1000];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                edge[i][j] = scanner.nextInt ();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print (edge[i][j] + " ");
            }
            System.out.println ();
        }

        int start = scanner.nextInt ();
        int end = scanner.nextInt ();
//        check(edge, start, end);
        System.err.println ("Result: " + check (edge, start, end));
    }
}
