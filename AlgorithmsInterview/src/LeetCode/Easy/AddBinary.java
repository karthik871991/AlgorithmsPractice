package LeetCode.Easy;

public class AddBinary {
	// Given two binary strings, return their sum (also a binary string).
	//
	// For example,
	// a = "11"
	// b = "1"
	// Return "100".
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String addBinary(String a, String b) {
        if(a==null||a.isEmpty()){
            return b;
        }
        if(b==null || b.isEmpty()){
            return a;
        }
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        StringBuilder sb = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());
        int carry = 0;
        for(int i=aArray.length-1, j = bArray.length-1; i>=0 || j>=0 || carry > 0; i--, j--){
            
            int sum = 0;
            sum += (i>=0)?aArray[i]-'0':0;
            sum += (j>=0)?bArray[j]-'0':0;
            sum +=carry;
            
            carry = sum/2;
            sum = sum%2;
            sb.append(sum);
            
            
        }
        return sb.reverse().toString();
    }

}
