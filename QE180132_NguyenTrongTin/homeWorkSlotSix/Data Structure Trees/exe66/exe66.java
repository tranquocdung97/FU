import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY MSI
 */

class node{
    int data;
    node right;
    node left;
}

public class exe66 {
    public static node insert(node t, int x){
        if(t == null){
            node temp = new node();
            temp.data=x;
            temp.left=null;
            temp.right=null;
            return temp;
        }else{
            if(x>t.data){
                t.right= insert(t.right, x);
            }else
                t.left = insert(t.left, x);
        }
        return t;
    }
    public static node turnright(node a){
        node b=a.left;
        node c=b.right;
        a.left=c;
        b.right=a;
        return b;
    }
    public static node turnleft(node a){
        node b=a.right;
        node c=b.left;
        a.right=c;
        b.left=a;
        return b;
    }
    public static int Treelever(node t){
        if(t == null) return -1;
        if(t.right==null && t.left==null) return 0;
        return 1 + Math.max(Treelever(t.left), Treelever(t.right));
    }
    public static boolean CheckAvl(node t){
        if(t == null) return true;
        if(Math.abs(Treelever(t.right)-Treelever(t.left))>1) return false;
        return CheckAvl(t.left) && CheckAvl(t.right);
    }
    public static node updateTreeAvl(node t){
        if(Math.abs(Treelever(t.left)-Treelever(t.right))>1){
            if(Treelever(t.left)>Treelever(t.right)){
                node  p =t.left;
                if(Treelever(p.left)>=Treelever(p.right)){
                    t=turnright(t);
                }else{
                    t.left= turnleft(t.left);
                    t=turnright(t);
                }
            }else{
                node p= t.right;
                if(Treelever(p.left)<=Treelever(p.right)){
                    t=turnleft(t);
                }else{
                    t.right=turnright(t.right);
                    t=turnleft(t);
                }
            }
        }
        if(t.left!=null) t.left=updateTreeAvl(t.left);
        if(t.right!=null) t.right=updateTreeAvl(t.right);
        return t;
    }
    public static void printNode(node t){
        if(t !=null){
            printNode(t.left);
            System.out.println(t.data+" ");
            if(t.left!=null) System.out.println(t.left.data+" ");
            if(t.right!=null) System.out.println(t.right.data+" ");
            printNode(t.right);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        node t = null;
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int temp = input.nextInt();
            t = insert(t, temp);
        }
        while(!CheckAvl(t)){
            t = updateTreeAvl(t);
        }
        System.out.println(Treelever(t));
    }
}