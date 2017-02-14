package CrackingTheCodingInterview.ArraysandStrings;

import java.util.HashMap;

public class IsUnique {
	/**
	 * Is Unique: Implement an algorithm to determine if a string has all unique
	 * characters. What if you cannot use additional data structures?
	 */

	public static void main(String[] args) {

		System.out.println(CheckIsUnique("abcde"));

		System.out.println(CheckIsUnique("abcded"));
	}

	public static boolean CheckIsUnique(String str) {
		HashMap<Character, Boolean> hm = new HashMap<Character, Boolean>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (hm.containsKey(c)) {
				return false;
			} else {
				hm.put(c, true);
			}
		}
		return true;
	}
}
