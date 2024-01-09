/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dienr
 */
public class Remove {
    public Node removeAtHead(Node headNode){
        if(headNode!=null){
            return headNode.getNext();
        }
        return headNode;
    }
    
    public Node removeAtTail(Node headNode){
        Node lastNode = headNode;
        Node preNode = null;
        while(lastNode.getNext()!=null){
            preNode = lastNode;
            lastNode.setNext(lastNode);
        }
        if(preNode==null){
            return null;
        } else {
            lastNode.setNext(preNode.getNext());
        }
        return headNode;
    }
    
    public Node removeAtIndex(Node headNode, int index){
        if(headNode==null || index<0){
            return null;
        }
        if(index==0){
            return removeAtHead(headNode);
        }
        Node curNode = headNode;
        Node preNode = null;
        int count = 0;
        boolean bIsFound = false;
        while(curNode!=null){
            if(count == index){
                bIsFound = true;
                break;
            }
            preNode = curNode;
            curNode = curNode.getNext();
            count++;
        }
        if(bIsFound){
            if(preNode==null){
                return null;
            }else {
                if(curNode!=null){
                    preNode.setNext(curNode.getNext());
                }
            }
        }
        return headNode;
    }
}
