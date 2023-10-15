/*********************************************************

 Following is the TreeNode structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;
     TreeNode() {
         this.data = 0;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data, TreeNode left, TreeNode right) {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 };
 ********************************************************/

import java.util.*;
public class Solution {
    public static List<Integer> preOrder(TreeNode root) {
		List<Integer> list = new ArrayList<>();
        preOrder(root, list);
        return list;

	}
    public static void preOrder(TreeNode root,List<Integer> list) {
		if(root==null){
			return;
		}
		list.add(root.data);
		preOrder(root.left,list);
		preOrder(root.right,list);

	}
     public static List< Integer > getInOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getInOrderTraversal(root, list);
        return list;
    }
    public static void getInOrderTraversal(TreeNode root,List<Integer> list){
        if(root==null){
            return ;
        }
        getInOrderTraversal(root.left,list);
        list.add(root.data);
       getInOrderTraversal(root.right,list);
    }
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
		postorderTraversal(root, list);
        return list;
        
	}
    public static void postorderTraversal(TreeNode root,List<Integer> list) {
        if(root==null){
            return;
        }
        postorderTraversal(root.left, list);
        postorderTraversal(root.right, list);
        list.add(root.data);
	}
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(getInOrderTraversal(root));
        list.add(preOrder(root));
        list.add(postorderTraversal(root));
        return list;
        
    }
}
