package LeetCode.Easy;

public class ImplementstrStr {
	// Implement strStr().
	//
	// Returns the index of the first occurrence of needle in haystack, or -1 if
	// needle is not part of haystack.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "mississippi";
		String needle = "issipi";
		System.out.println(strStr(haystack, needle));
	}

	public static int strStr(String haystack, String needle) {

		if (needle.length() == 0) {
			return 0;
		}
		if (needle == "") {
			return 0;
		}
		int length = haystack.length();
		int needleLength = needle.length();
		int threshold = 0;
		if (length < needleLength) {
			return -1;
		} else {
			threshold = length - needleLength;
		}
		for (int i = 0; i <= threshold; i++) {

			if (haystack.substring(i, needleLength + i).equals(needle)) {
				return i;
			}

		}
		return -1;
	}

}
