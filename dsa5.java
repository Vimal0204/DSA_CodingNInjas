
public class Solution {

	public static int firstIndex(int input[], int x) {
		if(input[0]==x){
            return 0;
        }
        if(input.length==1){
            return -1;
        }
        int smallInput[] = new int[input.length-1];
        for(int i = 1; i<input.length;i++){
            smallInput[i-1]=input[i];
        }
        int pos = 1;
        int smallAns = firstIndex(smallInput,x);
        if(smallAns>=0){
            return pos + smallAns;
        }
        else
            return smallAns;
		
	}
	
}
