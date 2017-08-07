package LeetCode;

import java.util.*;

public class ques122 {
	public int maxProfit(int[] prices) {
		if(prices==null||prices.length==0)
			return 0;
		int res=0;
		for(int i=0;i<prices.length-1;i++){
			int diff=prices[i+1]-prices[i];
			if(diff>0)
				res+=diff;
		}
		return res;
	}

	public static void main(String[] args) {
		int prices[]={7, 1, 5, 3, 6, 4};
		System.out.println(new ques122().maxProfit(prices));
		
	}
}
