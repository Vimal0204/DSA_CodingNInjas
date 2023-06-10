// import java.lang.Math;
public class Solution {

	public static int power(int x, int n) {
        if(n==0){
            return 1;
        }
        int smallAns = power(x,n-1);
        return x*smallAns;
		
//         int i  = (int)Math.pow(x,n);
//         return i ;
		
	}
}
