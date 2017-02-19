package LeetCode.Easy;

public class ReverseInteger {
//	Reverse digits of an integer.
//
//	Example1: x = 123, return 321
//	Example2: x = -123, return -321
//
//	click to show spoilers.
//
//	Note:
//	The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
//
//	Subscribe to see which companies asked this question.
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = -2147483648;
		System.out.println(reverse(n));
	}
	
	public static int reverse(int m) {
        long result = 0;
        int max = Integer.MAX_VALUE;
        long x = m;
        boolean negativeCheck  = false;
        if(x<0){
            x = 0 -x;
            negativeCheck = true;
        }
        while(x!=0){
            result = (result*10)+(x%10);
            x = x/10;
        }
        if(result>max){
            return 0;
        }
        if(negativeCheck){
            return 0 - (int)result;
        }
        return (int)result;
    }
}
