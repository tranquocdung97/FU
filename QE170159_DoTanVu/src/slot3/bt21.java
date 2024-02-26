
package slot3;
import java.util.Scanner;


    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    class LinkedList{
        Node head;
        LinkedList(){
            this.head = null;
        }
        void insert(int data){
            Node newNode = new Node(data);
            if (head == null){
                head = newNode;
            }else{
                Node last = head;
                while (last.next != null){
                    last = last.next;
                }
                last.next = newNode;
            }
        }
        void print(Node head){
            Node current = head;
            while (current != null){
                System.out.print(current.data + " ");
                current = current.next; 
            }
        }
    }
    public class bt21{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            LinkedList list = new LinkedList();
            for (int i = 0; i < n; i++){
                int data = sc.nextInt();
                list.insert(data);
            }
            list.print(list.head);
        }
    }

