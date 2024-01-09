/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dienr
 */
public class Add {
    public Node addElement(Node headNode, int value){
        Node temp = new Node(value);
        headNode.setNext(temp);
        return temp;
    }
}
