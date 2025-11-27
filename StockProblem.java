package com.org.java;

public class StockProblem {

	public static void main(String[] args) {
		int[] prices1= {7,1,4,6,5};
		int[] prices2= {5,4,6,7,1};
		
		System.out.println("Profit 1 :"+maxProfit(prices1));
		System.out.println("Profit 2 :"+maxProfit(prices2));
	}
	
	public static int maxProfit(int[] prices) {
		
		int minPrice=prices[0];
		int maxProfit=0;
		
		for(int i=0;i<prices.length;i++) {
			if(prices[i]<minPrice) {
				minPrice=prices[i];
			}
			else {
				maxProfit=Math.max(maxProfit, prices[i]-minPrice);
			}
			
			if(minPrice==prices[prices.length-1]) {
				return 0;
			}
		}
		return maxProfit;
		
	}
}
