/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author dienr
 */
public class MyLinkedList {
    public static DouList createList(int x){
        DouList node = new DouList();
        node.head = new Node();
        node.head.value = x;
        node.head.pre = null;
        node.head.next = null;
        node.tail = node.head;
        return node;
    }
    public static DouList addHead(DouList headNode, int value){
        Node temp = new Node();
        temp.value = value;
        temp.pre = null;
        temp.next = headNode.head;
        headNode.head.pre = temp;
        headNode.head = temp;
        return headNode;
    }

    public static DouList addTail(DouList tailNode, int value){
        Node temp = new Node();
        temp.value = value;
        temp.next = null;
        temp.pre = tailNode.tail;
        tailNode.tail.next = temp;
        tailNode.tail = temp;
        return tailNode;
    }

    public static void printList(DouList node){
        Node p = node.head;
        while (p!=null){
            System.out.print(p.value+" ");
            p = p.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DouList p = createList(1);
        for(int i=2; i<=n; i++){
            p = addHead(p, i);
            p = addTail(p, i);
        }
        printList(p);
    }
}
