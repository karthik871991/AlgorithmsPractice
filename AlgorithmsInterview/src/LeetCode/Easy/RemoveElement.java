package LeetCode.Easy;

public class RemoveElement {

	// Given an array and a value, remove all instances of that value in place
	// and return the new length.
	//
	// Do not allocate extra space for another array, you must do this in place
	// with constant memory.
	//
	// The order of elements can be changed. It doesn't matter what you leave
	// beyond the new length.
	//
	// Example:
	// Given input array nums = [3,2,2,3], val = 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int removeElement(int[] nums, int val) {
	        int current = 0;
	        
	        for(int i =0; i <nums.length; i++){
	            if(nums[i]!=val){
	                
	                nums[current] = nums[i];
	                current++;
	            }
	        }
	        return current;
	    }

}
