package LeetCode;

import java.util.*;

public class ques561 {
	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int res=0;
		for(int i=0;i<nums.length;i+=2){
			res+=nums[i];
		}
		return res;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 4, 3, 2 };
		System.out.println(new ques561().arrayPairSum(nums));
	}
}
