package LeetCode.Easy;

public class SearchInsertPosition {
	// Given a sorted array and a target value, return the index if the target
	// is found. If not, return the index where it would be if it were inserted
	// in order.
	//
	// You may assume no duplicates in the array.
	//
	// Here are few examples.
	// [1,3,5,6], 5 → 2
	// [1,3,5,6], 2 → 1
	// [1,3,5,6], 7 → 4
	// [1,3,5,6], 0 → 0
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[1];
		nums[0] = 1;
		System.out.println(searchInsertIterative(nums, 2));

	}

	public static int searchInsert(int[] nums, int target) {

		return BinarySearch(nums, 0, nums.length - 1, target);
	}

	private static int BinarySearch(int[] nums, int start, int end, int target) {
		if (start > end) {
			return start;
		}
		int mid = (start + end) / 2;
		if (nums[mid] == target)
			return mid;
		else if (nums[mid] > target) {
			return BinarySearch(nums, start, mid - 1, target);
		} else {
			return BinarySearch(nums, mid + 1, end, target);
		}
	}

	public static int searchInsertIterative(int[] nums, int target) {
		return searchInsertIterative(nums, 0, nums.length - 1, target);
	}

	public static int searchInsertIterative(int[] nums, int start, int end,
			int target) {
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}

}
