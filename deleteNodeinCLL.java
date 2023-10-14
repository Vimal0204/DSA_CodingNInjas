import java.util.HashMap;

/*

    Following is the representation of the Circular Linked List
    
    class Node<T> {
        T data;
        Node<T> next;
        
        public Node(T data) {
            this.data = data;
        }
    }

*/

public class Solution {

    public static Node<Integer> deleteNode(Node<Integer> head, int key) {
        if(head==null){
            return head;
        }
        Node<Integer> temp=head;
        HashMap<Integer,Integer> map = new HashMap<>();
        Node<Integer> curr =head;
        Node<Integer> prev=null;
        if (curr==head && curr.next==head && curr.data==key) {
            head=null;
            return head;
        }
        if(curr.data==key && curr==head){
            prev=head;
            while(prev.next!=head){
                prev=prev.next;
            }
            head=curr.next;
            prev.next=head;
            return head;
        }
        while(temp.next!=null){
            if(temp.next.data==key){
                temp.next=temp.next.next;
                return head;
            }
            if(map.containsKey(temp.data)){
                break;
            }else{
                map.put(temp.data, temp.data);
            }
            temp=temp.next;

        }
        return head;
    }

}
