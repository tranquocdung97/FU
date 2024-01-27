import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MyQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int n,k,temp;
        n = sc.nextInt();
        for (int i=0; i<n; i++){
            temp = sc.nextInt();
            queue.add(temp);
        }
        k = sc.nextInt();
        for (int i=0; i<k; i++){
            int x = queue.poll();
            queue.add(x);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(queue.poll()+" ");
        }
    }
}
