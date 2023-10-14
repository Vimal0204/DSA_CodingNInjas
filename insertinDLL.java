import java.util.* ;
import java.io.*; 

/************************************************************

 Following is the linkedList class structure:

 class Node<T> {
 T data;
 Node<T> next,prev;

 public Node(T data) {
 this.data = data;
 }
 }

 ************************************************************/

public class Solution {

    static Node insert(int k, int val, Node head) {
        Node<Integer> newNode = new Node<>(val);
        newNode.prev=null;
        newNode.next=null;
        Node<Integer> temp=head;
        //for length of list
        int n=1; //given that length of list is atleast 1 so we have taken n=1 here;
        while (temp.next!=null) {
            temp=temp.next;
            n++;
        }
        temp=head;
        if (k==0) {
           newNode.next=head;
           return newNode; 
        }else if (k==n){
            while (temp.next!=null) {
            temp=temp.next;
            }
            newNode.prev=temp;
            temp.next=newNode;
            return head;
        }else{
            for(int i=0;i<k-1;i++){
                // System.out.println(temp.data);
                temp=temp.next;
                
            }
            newNode.next=temp.next;
            temp.next.prev=newNode;
            newNode.prev=temp;
            temp.next=newNode;
            return head;
        }

    }
}
