package Programs;

class BestTimeToBuyAndSellStockSolution{
	
    public int maxProfit(int[] prices) {
    	int min=prices[0];
    	int max=0;
    	for(int i =0;i<prices.length;i++) {
    		
    			
    			if(prices[i]<min) {
    			  min=prices[i];
    			}
    			else {
    			
    				int profit = prices[i] - min;
    				if(max<profit) {
    					max=profit;
    				}
//    				max=Math.max(max, profit);																					
    				
    			}
    			
    			
    			
    	}
    	
    	System.out.println(min);
    	System.out.println(max);
    	
		return max;
    }
	
}

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		
		BestTimeToBuyAndSellStockSolution sol=new BestTimeToBuyAndSellStockSolution();
		int[] arr= {7,1,5,3,6,4};
		System.out.println(sol.maxProfit(arr));
		
	}
	
}
