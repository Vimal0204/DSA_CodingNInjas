import java.util.Stack;

// import com.sun.org.apache.bcel.internal.classfile.Node;

/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution
{
    public static Node reverseLinkedList(Node head)
    {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while (temp.next!=null){
            stack.push(temp.data);
            temp=temp.next;
        }
        head=temp;
        // System.out.println(head.next);
        while(!stack.isEmpty()){
            int elem=stack.pop();
            Node newNode=new Node(elem);
            newNode.next=null;
            temp.next=newNode;
            temp=temp.next;
        }
        return head;
    }
}
