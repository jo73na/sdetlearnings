package meetproblems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4 };
		int maxProfit = maxProfit(prices);
		System.out.println(maxProfit);
	}

	public static int maxProfit(int[] prices) {
		int len = prices.length;
		if (len == 1)
			return 0;

		int maxProfit = Integer.MIN_VALUE;
		int slProfit = 0;

		int start = 0;
		int adj = 1;

		while (adj < len) {
			if (prices[start] < prices[adj]) {
				slProfit = prices[adj] - prices[start];
				System.out.println(slProfit);
				maxProfit = (maxProfit < slProfit) ? slProfit : maxProfit;
			} else {
				start = adj;
			}
			adj++;
		}
		return maxProfit < 0 ? 0 : maxProfit;

	}

}
