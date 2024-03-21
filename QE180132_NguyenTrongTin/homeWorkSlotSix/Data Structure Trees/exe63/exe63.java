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

public class exe63 {
    public static node insert(node t, int x){
        if(t == null){
            node temp = new node();
            temp.data=x;
            temp.right=null;
            temp.left=null;
            return temp;
        }else{
            if(x >= t.data){
                t.right = insert(t.right, x);
            }else{
                t.left = insert(t.left, x);
            }
        }
        return t;
        }
    public static boolean ifLeafNote(node t){
        return (t.left == null && t.right == null);
    }
    public static int countLeafNode(node t){
        if(t == null) return 0;
        if(ifLeafNote(t)) return 1;
        return countLeafNode(t.left)+ countLeafNode(t.right);
    }
    public static void main(String[] args) {
        int n, temp;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        node t = null;
        for (int i = 0; i < n; i++) {
            temp = input.nextInt();
            t = insert(t, temp);
        }
        System.out.println(countLeafNode(t));
    }
}