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
        if (head==null) {
            return head;
        }
        if (head.next==null) {
            return head;
        }
        Node reversedNode = reverseLinkedList(head.next);
        head.next.next=head;
        head.next=null;
       
        return reversedNode;
    }
}
