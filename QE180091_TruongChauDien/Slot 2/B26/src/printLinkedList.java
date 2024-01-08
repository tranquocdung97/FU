/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dienr
 */
public class printLinkedList {
    public void print(Node head){
        if(head == null){
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while(temp != null){
                System.out.print(temp.getVal()+" ");
                temp = temp.getNext();
            }
        }
    }
}
