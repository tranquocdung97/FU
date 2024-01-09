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
    
    public Node addToHead(Node headNode, int value){
        Node newNode = new Node(value);
        if(headNode != null){
             newNode.setNext(headNode);
        }
        return newNode;
    }
    
    public Node addToTail(Node headNode, int value){
        Node newNode = new Node(value);
        if(headNode==null){
            return newNode;
        } else {
            Node lastNode = headNode;
            while(lastNode.getNext()!=null){
                lastNode.setNext(lastNode);
            }
            lastNode.setNext(newNode);
        }
        return headNode;
    }
    
    public Node addToIndex(Node headNode, int index, int value){
        if(index==0){
            return addToHead(headNode, value);
        } else {
            Node curNode = headNode;
            Node newNode = new Node(value);
            int count=0;
            while(curNode != null){
                count++;
                if(count == index){
                    newNode.setNext(curNode.getNext());
                    curNode.setNext(newNode);
                    break;
                }
                curNode.setNext(curNode);
                
            }
        }
        
        
        return headNode;
    } 
}
