package LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generate(0));

	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (numRows == 0)
			return result;
		List<Integer> dynamic = new ArrayList<Integer>();
		dynamic.add(1);
		result.add(dynamic);

		for (int i = 1; i < numRows; i++) {
			List<Integer> buffer = new ArrayList<Integer>();
			buffer.add(1);
			for (int j = 1; j < dynamic.size(); j++) {
				buffer.add(dynamic.get(j - 1) + dynamic.get(j));
			}
			buffer.add(1);
			result.add(buffer);
			dynamic = buffer;
		}
		return result;

	}

}
