/****************************************************************

	Following is the class structure of the Node class:

	class Node<T> {
    	T data;
    	Node<T> next;
    
    	public Node(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static int findNode(Node<Integer> head, int n) {
		if (head==null) {
			return -1;
		}
		Node<Integer> temp = head;
		int pos=0;
		while(temp.next!=null){
			if (temp.data==n) {
				return pos;
			}
			temp=temp.next;
			pos++;
		}
		if(temp.data==n){
			return pos;
		}
		return -1;
	}
}
