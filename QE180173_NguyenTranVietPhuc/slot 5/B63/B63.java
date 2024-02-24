/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b63;

/**
 *
 * @author PHUC
 */
import java.util.Scanner;

public class B63 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BinaryTree tree = new BinaryTree();
    for (int i = 0; i < n; i++)
      tree.add(sc.nextInt());

    System.out.print(tree.countLeaf(tree.root));
  }

  static class BinaryTree {
    class Node {
      int val;
      Node next, prev;

      protected Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
      }
    }


    Node root;

    public void add(int val) {
      root = addNodeRecursive(root, val);
    }

    private Node addNodeRecursive(Node current, int val) {
      if (current == null)
        return new Node(val);
      if (val < current.val)
        current.prev = addNodeRecursive(current.prev, val);
      else {
        current.next = addNodeRecursive(current.next, val);
      }
      return current;
    }

    public int countLeaf(Node current) {
      int count = 0;
      if (current != null) {
        if (current.prev == null && current.next == null)
          count++;
        else {
          count += countLeaf(current.prev);
          count += countLeaf(current.next);
        }
      }
      return count;
    }
  }
}
