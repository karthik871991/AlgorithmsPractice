package LeetCode.Easy;

public class ClimbingStairs {
	// You are climbing a stair case. It takes n steps to reach to the top.
	//
	// Each time you can either climb 1 or 2 steps. In how many distinct ways
	// can you climb to the top?
	//
	// Note: Given n will be a positive integer.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int climbStairs(int n) {
        if(n==1)return 1;
        if(n==2)return 2;
        if(n==3)return 3;
        int one = 1;
        int two = 2;
        int total = 0;
        for(int i=2;i<n;i++){
            total = one+two;
            one = two;
            two = total;
            
        }
        return total;
    }

}
