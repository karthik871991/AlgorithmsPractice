package CrackingTheCodingInterview.ArraysandStrings;

import java.util.HashMap;

public class Permutation {
	/**
	 * Check Permutation: Given two strings, write a method to decide if one is
	 * a permutation of the other.
	 */
	public static void main(String[] args) {
		System.out.println(CheckPermutation("abcde", "edcba"));

		System.out.println(CheckPermutation("abcded", "ss"));

	}

	public static boolean CheckPermutation(String str1, String str2) {

		if(str1.length()!=str2.length()){
			return false;
		}
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		
		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
			}
			else{
				hm.put(c, 1);
			}
			
		}

		for (int i = 0; i < str2.length(); i++) {
			char c = str2.charAt(i);
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)-1);
			}
			else{
				hm.put(c, 1);
			}
		}

		for(Character key : hm.keySet()){
			if(hm.get(key)!=0){
				return false;
			}
		}
		return true;

	}
}
