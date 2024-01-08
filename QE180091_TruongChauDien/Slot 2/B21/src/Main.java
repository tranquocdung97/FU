
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        Node l = new Node(x);
        Node p = l;
        for(int i=1; i<n; i++){
            x = sc.nextInt();
            Add add = new Add();
            p = add.addElement(p, x);
        }
        printLinkedList linkedList = new printLinkedList();
        linkedList.print(l);
    }
}
