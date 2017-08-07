package LeetCode;

import java.util.*;

public class ques228 {
	public List<String> summaryRanges(int[] nums) {
		List<String> res = new ArrayList<>();
		if (nums.length == 0 || nums == null)
			return res;
		int left = 0;
		while (left < nums.length) {
			int right = 1;
			while(left+right<nums.length&&nums[left]+right==nums[left+right]) right++;
			if (right<=1)
				res.add(nums[left] + "");
			else
				res.add(nums[left] + "->" + nums[left+right-1]);
			left+=right;
		}
		return res;
	}

	public static void main(String[] args) {
		int nums[] = { 0, 1, 2, 4, 5, 7 };
		int k = 7;
		System.out.println(new ques228().summaryRanges(nums));
	}
}
