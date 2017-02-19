package LeetCode.Easy;

public class LongestCommonPrefix {
	// Write a function to find the longest common prefix string amongst an
	// array of strings.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "leeeeat";
		String str2 = "leeeeads";
		String str3 = "leeeeatcodes";
		String str4 = "leeeeader";
		String strs[] = { str1, str2, str3, str4 };
		String strs1[] = { "aa","a" };

		System.out.println(longestCommonPrefix(strs1));

	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		String result = strs[0];
		int length = result.length();
		for (int i = 0; i < strs.length; i++) {
			if (strs[i] == "") {
				return "";
			}
			length = strs[i].length() > result.length() ? result.length()
					: strs[i].length();

			for (int j = 0; j < length; j++) {

				if (result.charAt(j) != strs[i].charAt(j)) {
					result = result.substring(0, j);
					if (result.length() == 0)
						return "";
					break;
				}
			}
		}
		if (length == 0)
			return "";
		return result.substring(0, length);
	}

}
