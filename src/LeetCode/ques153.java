package LeetCode;

import java.util.*;

public class ques153 {
	public int findMin(int[] nums) {
		if(nums==null||nums.length==0)
			return 0;
		int l=0;
		int r=nums.length-1;
		int min=Integer.MAX_VALUE;
		while (l<=r) {
			int mid=(l+r)/2;
			min=Math.min(min, nums[mid]);
			if(nums[mid]>nums[r])l=mid+1;
			else r=mid-1;
		}
		return min;
	}
	public int findMin1(int[] nums) {
		Arrays.sort(nums);
		return nums[0];
	}

	public static void main(String[] args) {
		int nums[] = {};
		System.out.println(new ques153().findMin(nums));
	}
}
