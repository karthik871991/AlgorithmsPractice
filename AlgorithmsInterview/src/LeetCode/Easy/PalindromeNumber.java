package LeetCode.Easy;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(12344321));

	}

	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;

		int zeros = 1;
		while (x / zeros >= 10) {
			zeros *= 10;
		}

		while (x != 0) {
			int left = x / zeros;
			int right = x % 10;
			if (left != right) {
				return false;
			}
			x = (x % zeros) / 10;
			zeros /= 100;
		}
		return true;
	}

}
