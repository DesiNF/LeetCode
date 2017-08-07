package LeetCode;

import java.util.*;
/**
 * Example 1:

Input: k = 3, n = 7

Output:

[[1,2,4]]

Example 2:

Input: k = 3, n = 9

Output:

[[1,2,6], [1,3,5], [2,3,4]]
 * @author Administrator
 *
 */
public class ques216 {
	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>>res=new ArrayList<>();
		if(k<1||n<1)return res;
		List<Integer>cur=new ArrayList<>();
		rec(res,cur,0,k,n,1);
		return res;
	}
	

	private void rec(List<List<Integer>> res, List<Integer> cur, int sum, int k, int n, int level) {
		if(sum==n&&k==0){
			res.add(new ArrayList(cur));
			return ;
		}else if(sum>n||k<=0)return ;
		for(int i=level;i<=9;i++){
			cur.add(i);
			rec(res, cur, sum+i, k-1, n, i+1);
			cur.remove(cur.size()-1);
		}
	}


	public static void main(String[] args) {
		int k=3;
		int n=9;
		System.out.println(new ques216().combinationSum3(k, n));
	}
}
