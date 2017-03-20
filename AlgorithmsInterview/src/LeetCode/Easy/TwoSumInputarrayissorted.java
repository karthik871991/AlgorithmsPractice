package LeetCode.Easy;

public class TwoSumInputarrayissorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int low = 0;
        int high = numbers.length-1;
        while(low<high){
            if((numbers[low] + numbers[high]) == target){
                result[0] = low+1;
        result[1] = high+1;
        break;
            }
            else if((numbers[low] + numbers[high]) > target){
                high--;
            }
            else{
                low++;
            }
        }
        
        return result;
    }

}
