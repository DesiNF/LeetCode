package LeetCode;

import java.util.Arrays;

public class sanSumClosest {
	/**
	 * Array 16 
	 * Given an array S of n integers, find three integers in S such
	 * that the sum is closest to a given number, target. Return the sum of the
	 * three integers. You may assume that each input would have exactly one
	 * solution.
	 */
	public int threeSumClosest(int[] nums, int target) {
		if(nums==null||nums.length<3)
			return 0;
		Arrays.sort(nums);
		int ret=0;
		int Dist=Integer.MAX_VALUE;
		for(int i=0;i<nums.length-2;i++){
			if(i>0&&nums[i]==nums[i-1])continue;
			int l=i+1;
			int r=nums.length-1;
			while (l<r) {
				int sum=nums[l]+nums[r]+nums[i];
				if(sum<target){
					if(target-sum<Dist){
						Dist=target-sum;
						ret=sum;
					}
					l++;
				}else if (sum>target) {
					if(sum-target<Dist){
						Dist=sum-target;
						ret=sum;
					}
					r--;
				}else {
					return sum;
				}
			}
		}
		return ret;
	}
	
	public static void main(String[] args) {
		int nums[]={-1,2,1,-4};
		int target=1;
		System.out.println(new sanSumClosest().threeSumClosest(nums, target));
	}
}
