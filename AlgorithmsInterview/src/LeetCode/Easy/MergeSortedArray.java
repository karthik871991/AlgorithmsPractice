package LeetCode.Easy;

public class MergeSortedArray {

	// Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1
	// as one sorted array.
	//
	// Note:
	// You may assume that nums1 has enough space (size that is greater or equal
	// to m + n) to hold additional elements from nums2. The number of elements
	// initialized in nums1 and nums2 are m and n respectively.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int first = m - 1;
		int second = n - 1;
		int total = m + n - 1;

		while (first >= 0 && second >= 0) {
			nums1[total--] = nums1[first] > nums2[second] ? nums1[first--]
					: nums2[second--];
		}
		while (second >= 0) {
			nums1[total--] = nums2[second--];
		}

	}

}
