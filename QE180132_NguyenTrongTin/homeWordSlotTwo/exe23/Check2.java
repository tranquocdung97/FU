
import java.util.Scanner;

public class Check2 {
      public static class Node{
          int val;
          Node next;
          
          public Node(int val){
              this.val = val;
             this.next = null;
          }
      }
      public static void printList(Node headNode){
          Node curNode = headNode;
          while(curNode !=null){
              System.out.print(curNode.val+" ");
              curNode = curNode.next;
          }
      }
      public static Node removeHead( Node headNode){
          
          if(headNode != null){
              return headNode.next;
          }
          return headNode;
      }
      public static Node removeTail( Node headNode){
          if(headNode == null){
              return null;
          }
          Node NewNode = null;
          Node curNode = headNode;
          while(curNode.next != null){
                  NewNode = curNode;
                  curNode= curNode.next;

          }
              if(NewNode == null){
                  return null;
              }else{
                  NewNode.next = curNode.next;
              }
              return headNode;

      }
      public static Node removeInMid(Node headNode, int index){
        if(headNode == null || index < 0 )
           return null;
        if(index == 0){
           return removeHead( headNode);
        }
          int count = 0;
          Node curNode = headNode;
          Node newNode = null;        
          boolean bIsFound = false;
              while(curNode.next != null){
                  if(count == index){
                     bIsFound = true;
                      break;
                  }
                  newNode = curNode;
                  curNode = curNode.next;
                  count++;
              }
              if(bIsFound){
                  if(newNode == null){
                      return null;
                  } else{
                      if(curNode != null)
                          newNode.next = curNode.next;
                  }
              }
          
          
          
          return headNode;
      }
    public static Node addtotail(Node headNode,int val){
        Node head = new Node(val);
        if(headNode == null){
            return head;
        }else{
            Node lastHead = headNode;
            while(lastHead.next != null){
                lastHead = lastHead.next;
            }
            lastHead.next=head;
        }
        return headNode;
    }
        
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          int n = input.nextInt();
          Node head = null;
          for (int i = 0; i < n; i++) {
              int v = input.nextInt();
             head = addtotail(head, v);
          }
          int j = input.nextInt();
          if(j == 0){
             head = removeHead(head);
          }else if(j == n-1){
             head = removeTail(head);
          }else{
             head = removeInMid(head, j);
          }
          printList(head);
    }
}
