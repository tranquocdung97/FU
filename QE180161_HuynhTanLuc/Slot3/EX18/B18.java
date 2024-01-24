
package b18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B18 {
    
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 2; i <= n && i < 10; i++) {
            if (isPrime(i))
                queue.add(i);
        }
        
        while (!queue.isEmpty()) {
            for (int i = 1; i <= 9; i++) {
                int k = queue.peek() * 10 + i;
                if (k <= n && isPrime(k)) {
                    queue.add(k);
                }
            }
            System.out.print(queue.poll() + " ");
        }
    }
    
}
