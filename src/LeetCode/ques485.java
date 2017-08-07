package LeetCode;

import java.util.*;

public class ques485 {
	public int findMaxConsecutiveOnes(int[] nums) {
		int max = Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==1)sum++;
			else{
				max=Math.max(max, sum);
				sum=0;
			}
		}
		max=Math.max(max, sum);
		return max;
	}

	public static void main(String[] args) {
		int nums[] = {0};

		System.out.println(new ques485().findMaxConsecutiveOnes(nums));
	}
}
