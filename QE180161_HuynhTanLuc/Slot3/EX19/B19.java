
package b19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        Queue<Integer> queue = new LinkedList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int number = sc.nextInt();
            if (!queue.contains(number))
                queue.add(number);
        }
        int k = sc.nextInt();
        
        while (queue.size() > k)
            queue.poll();
        
        while (!queue.isEmpty())
            System.out.print(queue.poll() + " ");
    }
    
}
