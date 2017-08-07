package LeetCode;

import java.util.*;

public class ques581 {
	public int findUnsortedSubarray(int[] nums) {
		int l=0;
		int r=nums.length-1;
		int tmp[]=new int[nums.length];
		for(int i=0;i<nums.length;i++)tmp[i]=nums[i];
		Arrays.sort(tmp);
		while (l<nums.length&&nums[l]==tmp[l])l++;
		while (r>l&&nums[r]==tmp[r]) r--;
		return r-l+1;
	}

	public static void main(String[] args) {
		int nums[] = {1,3,2,2,2};
		System.out.println(new ques581().findUnsortedSubarray(nums));
	}
}
