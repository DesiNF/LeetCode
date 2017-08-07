package LeetCode;

import java.util.*;

public class ques120 {
	public int minimumTotal(List<List<Integer>> triangle) {
		int n=triangle.size();
		int dp[]=new int[n];
		for(int i=0;i<n;i++){
			dp[i]=triangle.get(n-1).get(i);
		}
		for(int i=n-2;i>=0;i--)
			for(int j=0;j<=i;j++)
				dp[j]=Math.min(dp[j], dp[j+1])+triangle.get(i).get(j);
		return dp[0];
	}

	public static void main(String[] args) {
		List<List<Integer>> triangle=new ArrayList<>();
		List<Integer> res=new ArrayList<>();
		res.add(2);
		triangle.add(res);
		res=new ArrayList<>();
		res.add(3);
		res.add(4);
		triangle.add(res);
		res=new ArrayList<>();
		res.add(6);
		res.add(5);
		res.add(7);
		triangle.add(res);
		res=new ArrayList<>();
		res.add(4);
		res.add(1);
		res.add(8);
		res.add(3);
		triangle.add(res);
		System.out.println(new ques120().minimumTotal(triangle));
		//System.out.println(triangle);
		
	}
}
