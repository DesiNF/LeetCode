package LeetCode;

import java.util.*;

public class ques121 {
	public int maxProfit(int[] prices) {
		if(prices==null||prices.length==0)
			return 0;
		int local=0;
		int global=0;
		for(int i=0;i<prices.length-1;i++){
			local=Math.max(local+prices[i+1]-prices[i], 0);
			global=Math.max(local, global);
		}
		return global;
	}

	public static void main(String[] args) {
		int prices[]={7, 1, 5, 3, 5, 4};
		System.out.println(new ques121().maxProfit(prices));
		
	}
}
