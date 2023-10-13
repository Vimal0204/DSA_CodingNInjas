import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		if((first==null && second==null)||(first!=null && second==null) ){
            return first;
        }
        if (first==null && second!=null) {
            return second;
        }
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> temp=head;
        LinkedListNode<Integer> temp1=first;
        LinkedListNode<Integer> temp2=second;
        while (temp1!=null && temp2!=null) {
            if (temp1.data<temp2.data) {
                LinkedListNode<Integer> newNode = new LinkedListNode<>(temp1.data);
                newNode.next=null;
                if (head==null) {
                    head=newNode;
                    temp=head;
                }else{
                    temp.next=newNode;
                    temp=temp.next;
                }
                temp1=temp1.next;
            }
            else{
                LinkedListNode<Integer> newNode = new LinkedListNode<>(temp2.data);
                newNode.next=null;
                if (head==null) {
                    head=newNode;
                    temp=head;
                }else{
                    temp.next=newNode;
                    temp=temp.next;
                }
                temp2=temp2.next;
            }
        }
        while (temp1!=null) {
            LinkedListNode<Integer> newNode = new LinkedListNode<>(temp1.data);
                newNode.next=null;
              if (head==null) {
                    head=newNode;
                    temp=head;
                }else{
                    temp.next=newNode;
                    temp=temp.next;
                }
                temp1=temp1.next;        
        }
        while (temp2!=null) {
            LinkedListNode<Integer> newNode = new LinkedListNode<>(temp2.data);
                newNode.next=null;
                if (head==null) {
                    head=newNode;
                    temp=head;
                }else{
                    temp.next=newNode;
                    temp=temp.next;
                }
                temp2=temp2.next;
        }
        return head;
	}
}
