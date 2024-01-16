import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;


public class exe18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Integer> qe = new LinkedList<>();
        int n,k,temp;
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            temp = input.nextInt();
            qe.add(temp);
        }
        k = input.nextInt();
        for (int i = 0; i < k; i++) {
            int x = qe.poll();
            qe.add(x);
        }
        while(!qe.isEmpty()){
            
            System.out.print(qe.element() + " ");
            qe.remove();
        }
    }
}