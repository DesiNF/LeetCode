package LeetCode;

import java.util.*;

public class ques268 {
	public int missingNumber(int[] nums) {
		/*if(nums==null||nums.length==0)
			return 0;
		if(nums.length==1&&nums[0]==0)
			return 1;*/
		Arrays.sort(nums);
		int i=0;
		for(i=0;i<nums.length;i++){
			if(i!=nums[i])
				return i;
		}
		return i;
	}

	public static void main(String[] args) {
		int nums[] = {1,0};
		System.out.println(new ques268().missingNumber(nums));
	}
}
