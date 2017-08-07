package LeetCode;

import java.util.*;

public class ques209 {
	public int minSubArrayLen(int s, int[] nums) {
		int res=Integer.MAX_VALUE;
		int l=0;
		int sum=0;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
			while (l<=i&&sum>=s) {
				res=Math.min(res, i-l+1);
				sum-=nums[l++];
			}
		}
		return res==Integer.MAX_VALUE?0:res;
	}
	
	//O(nlgn)
	public int minSubArrayLen2(int s, int[] nums) {
		int len=nums.length;
		int sums[]=new int[len+1];
		for(int i=1;i<len+1;i++)
			sums[i]=sums[i-1]+nums[i-1];
		int res=len+1;
		for(int i=0;i<len+1;i++){
			int right=searchRight(i+1,len,sums[i]+s,sums);
			if(right==len+1)break;
			if(res>right-i)res=right-i;
		}
		return res==len+1?0:res;
	}
	private int searchRight(int l, int r, int key, int[] sums) {
		while (l<=r) {
			int mid=(l+r)/2;
			if(sums[mid]>=key)r=mid-1;
			else l=mid+1;
		}
		return l;
	}

	public static void main(String[] args) {
		int nums[] = {2,3,1,2,4,3};
		int s=7;
		System.out.println(new ques209().minSubArrayLen2(s, nums));
	}
}
