/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackqueue;

import java.util.ArrayList;

public class MyLinkedListStack implements IStackQueue{
    
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }        
    }
    
    Node topNode;
    
    MyLinkedListStack() {
        topNode = null;
    }
    @Override
    public boolean push(int value) {
        //Them 1 phan tu vao dau cua LinkedList
        if (!isFull()) {
            Node newNode = new Node(value);                                
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            int value = topNode.data;
            topNode = topNode.next;    
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void show() {
        if (isEmpty()) {    
            System.out.println("Stack is Empty!!");
            return;
        }
        Node currNode = topNode;
        ArrayList<Integer> currList = new ArrayList<>();
        while (currNode != null) {
            //System.out.println(currNode.data + " ");
            currList.add(currNode.data);
            currNode = currNode.next;
        }
        for (int i = currList.size() - 1; i >= 0; i--) {
            System.out.print(currList.get(i) + " ");
        }
        System.out.println();
    }
    
    
    
    
    
}
