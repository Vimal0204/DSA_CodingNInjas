import java.util.*;
/*********************************************************

 Following is the TreeNode structure:

 class TreeNode<T>
 {
     T data;
     TreeNode<T> left;
     TreeNode<T> right;

     TreeNode(T data)
     {
         this.data = data;
         left = null;
         right = null;
     }
 };
 ********************************************************/

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Solution {
    public static List<Integer> levelOrder(TreeNode<Integer> root){
        Queue<TreeNode<Integer>> pendingNode = new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        pendingNode.add(root);
        while(!pendingNode.isEmpty()){
            TreeNode<Integer> frontNode=pendingNode.poll();
            list.add(frontNode.data);
            if(frontNode.left!=null)
                pendingNode.add(frontNode.left);
            if(frontNode.right!=null)    
                pendingNode.add(frontNode.right);

        }
        return list;
    }
}
