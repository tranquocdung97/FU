
package b17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class B17 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < n;i++) {
            int number = sc.nextInt();
            queue.add(number);
        }
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            queue.add(queue.poll());
        }
        
        while (!queue.isEmpty())
            System.out.print(queue.poll() + " ");
    }
    
}
