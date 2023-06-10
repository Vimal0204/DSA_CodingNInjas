public class Solution {

	public static int count(int n){
		//Write your code here
        if(n==0){
            return 0;
        }
        n=n/10;
        int smallAns = count(n);
        return 1+smallAns;
        
    }
}
