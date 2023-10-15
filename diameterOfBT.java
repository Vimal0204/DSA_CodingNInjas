/*************************************************************

 Following is the Binary Tree Node structure:

 class TreeNode<T> {
     public T data;
     public BinaryTreeNode<T> left;
     public BinaryTreeNode<T> right;

     TreeNode(T data) {
         this.data = data;
         left = null;
         right = null;
     }
 }

 *************************************************************/

public class Solution {
    public static int heightOfBinaryTree(TreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        return 1+(Math.max(heightOfBinaryTree(root.left), heightOfBinaryTree(root.right)));
    }
    public static int diameterOfBinaryTree(TreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        int option1=heightOfBinaryTree(root.right)+heightOfBinaryTree(root.left);
        int option2=diameterOfBinaryTree(root.left);
        int option3=diameterOfBinaryTree(root.right);
        return Math.max(option1,Math.max(option1,option2));
    }
}
