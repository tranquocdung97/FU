/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dienr
 */
public class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public Node() {
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
    
    

    public int getVal() {
        return value;
    }

    public void setVal(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
