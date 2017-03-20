package LeetCode.Easy;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int profit = 0;
        int min = prices[0];
        int max = 0;
        
        for(int i=1; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            else{
                if(prices[i] - min > profit){
                    profit = prices[i] - min;
                }
            }
        }
        return profit;
    }
	
}
