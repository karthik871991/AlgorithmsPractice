package LeetCode.Easy;

public class SquareRoot {
	// Implement int sqrt(int x).
	//
	// Compute and return the square root of x.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		System.out.println(Sqrt(i));

	}
	
	public static int Sqrt(int x){
		long r = x;
		
		while(r*r >x){
			r= (r+x/r)/2;
		}
		return (int)r;
	}

}
