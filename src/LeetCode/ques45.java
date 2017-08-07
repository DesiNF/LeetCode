package LeetCode;

import java.util.*;

public class ques45 {
	public int jump(int[] nums) {
		int res=0,i=0,cur=0;
		while (cur<nums.length-1) {
			int pre=cur;
			while (i<=pre) {
				cur=Math.max(cur, i+nums[i]);
				++i;
			}
			++res;
			if(pre==cur) return -1;
		}
		return res;
	}

	public static void main(String[] args) {
		int[] nums = { 2,3,1,1,4 };
		System.out.println(new ques45().jump(nums));
	}
}
