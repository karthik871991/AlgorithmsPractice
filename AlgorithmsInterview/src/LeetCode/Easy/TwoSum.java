package LeetCode.Easy;

import java.util.HashMap;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//Example:
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = new int[4];
		nums[0]= 2;
				nums[1]=7;
				nums[2]=11;
				nums[3]=15;
				int target = 9;
				System.out.println(twoSum(nums, target));

	}
	
	public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int check = target - nums[i];
            if(hm.containsKey(check)){
                result[0] = hm.get(check);;
                result[1] = i;
            }
                hm.put(nums[i], i);
            
        }
        return result;
    }

}
