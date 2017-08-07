package LeetCode;

import java.util.*;

public class ques152 {
	public int maxProduct(int[] nums) {
		if(nums==null)
			return 0;
		if(nums.length==1)
			return nums[0];
		int max_local=nums[0];
		int min_local=nums[0];
		int global=nums[0];
		for(int i=1;i<nums.length;i++){
			int max_copy=max_local;
			max_local=Math.max(Math.max(nums[i]*max_local, nums[i]), nums[i]*min_local);
			min_local=Math.min(Math.max(nums[i]*max_copy, nums[i]), nums[i]*min_local);
			global=Math.max(max_local, global);
		}
		return global;
	}

	public static void main(String[] args) {
		int nums[] = {2,3,-2,4};
		System.out.println(new ques152().maxProduct(nums));
	}
}
