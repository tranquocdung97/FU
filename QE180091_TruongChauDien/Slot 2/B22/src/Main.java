
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Add add = new Add();
        int n = sc.nextInt();
        int x = sc.nextInt();
        Node l = new Node(x);
        Node p = l;
        for(int i=1; i<n; i++){
            x = sc.nextInt();
            p = add.addElement(p, x);
        }
        int index = sc.nextInt();
        x = sc.nextInt();
        sc.close();
        l = add.addToIndex(l, index, x);
        printLinkedList linkedList = new printLinkedList();
        linkedList.print(l);
    }
}
