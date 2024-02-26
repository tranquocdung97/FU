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

public class exe65 {
    public static node insert(node t, int x){
        if( t == null){
        node temp = new node();
        temp.data=x;
        temp.right=null;
        temp.left=null;
        return temp;
    }else{
            if(x>= t.data){
                t.right= insert(t.right, x);
            }else
                t.left = insert(t.left, x);
        }
        return t;
    }
    public static int treelever(node t){
        if(t == null) return -1;
        if(t.right==null && t.left==null) return 0;
        return 1+ Math.max(treelever(t.right), treelever(t.left));
    }
    public static boolean checkAvl(node t){
        if(t == null) return true;
        if(Math.abs(treelever(t.left)-treelever(t.right))>1) return false;
        return checkAvl(t.left) && checkAvl(t.right);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        node t = null;
        for (int i = 0; i < n; i++) {
            int temp = input.nextInt();
            t=insert(t, temp);
        }
        System.out.println(checkAvl(t));  
    }
}