
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node node = new Node();
        Add add = new Add();
        Remove remove = new Remove();
        int n = sc.nextInt();
        int x = sc.nextInt();
        Node l = new Node(x);
        Node p = l;
        for(int i=1; i<n; i++){
            x = sc.nextInt();
            p = add.addElement(p, x);
        }
        int index = sc.nextInt();
        
        sc.close();
        p = node.getNode(l, index);
        System.out.println(p.getVal());
    }
}
