package LeetCode.Easy;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("a Ab"));
	}

	
	public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int len = s.length()-1;
        for(int i=0; i<s.length()/2; i++, len--){
            if(s.charAt(i)!=s.charAt(len)){
                return false;
            }
        }
        return true;
    }
}
