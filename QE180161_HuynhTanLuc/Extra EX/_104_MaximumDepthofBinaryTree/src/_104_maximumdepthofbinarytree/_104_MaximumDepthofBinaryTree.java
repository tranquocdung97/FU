/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _104_maximumdepthofbinarytree;


public class _104_MaximumDepthofBinaryTree {
    
    //maxDepth(root) => Di tim chieu cao cua cay root
    public int maxDepth(TreeNode root) {
        //B1: Dieu kien dung | Bai toan co so
        if (root == null)
            return 0;
        //B2: Cong thuc de quy:
        int heightLeftTree = maxDepth(root.left);
        int heightRightTree = maxDepth(root.right);
        int result = Math.max(heightLeftTree, heightRightTree) + 1;
        return result;
    }
    
    public static void main(String[] args) {
        
    }
    
}
