public class Solution {

	public static int sum(int input[]) {
		if(input.length==0){
            return 0;
        }
        if(input.length==1){
            return input[0];
        }
        int sum = input[0];
        int smallInput [] = new int [input.length-1];
        for(int i = 1; i<input.length;i++){
            smallInput[i-1] = input[i];
        }
        int smallAns = sum(smallInput);
        return smallAns+sum;
        
	}
}

