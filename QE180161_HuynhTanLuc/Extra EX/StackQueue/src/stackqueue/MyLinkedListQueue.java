/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackqueue;

public class MyLinkedListQueue implements IStackQueue{
    
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }        
    }
    
    Node headNode, tailNode;

    public MyLinkedListQueue() {
        headNode = tailNode = null;
    }       
    
    @Override
    public boolean push(int value) {
        if (isFull()){
            return false;
        }
        Node newNode = new Node(value);
        if (isEmpty()) {
            headNode = tailNode = newNode;
        } else {
            tailNode.next = newNode;
            tailNode = newNode;
        }       
        return true;       
    }

    @Override
    public int pop() {
        if (isEmpty())
            return -1;
        int value = headNode.data;
        
        if (headNode == tailNode)
            headNode = tailNode = null;
        else {
            headNode = headNode.next;
        }
        return value;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return (headNode == null && tailNode == null);
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }else {
            Node currNode = headNode;
            while (currNode != null) {                
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }
            System.out.println();
        }
    }
    
}
