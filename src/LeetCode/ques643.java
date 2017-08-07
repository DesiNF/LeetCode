package LeetCode;

import java.util.*;

public class ques643 {
	public double findMaxAverage(int[] nums, int k) {
		int len=nums.length;
		int sum=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<len-k+1;i++){
			for(int j=0;j<k;j++){
				sum+=nums[i+j];
			}
			max=Math.max(max, sum);
			sum=0;
		}
		return (double)max/k;
	}

	public static void main(String[] args) {
		int nums[] = {1,12,-5,-6,50,3};
		System.out.println(new ques643().findMaxAverage(nums, 4));
	}
}
