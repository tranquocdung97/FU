/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dienr
 */
public class Convert {
    public Node convertTo(Node headNode, int a, int b){
        Node p = headNode;
        while(p!=null){
            if(p.getVal()==a){
                p.setVal(b);
            }
            p = p.getNext();
        }
        return headNode;
    }
}
