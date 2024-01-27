import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MyQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (!queue.contains(x)){
                queue.add(x);
            }
        }
        int k = sc.nextInt();
        if (queue.size()>k){
            queue.poll();
        }
        while (!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }
    }
}
