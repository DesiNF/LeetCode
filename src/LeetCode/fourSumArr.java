package LeetCode;

import java.util.*;

/**
 * Arr18
 * 
 * Given an array S of n integers, are there elements a, b, c, and d in S such
 * that a + b + c + d = target? Find all unique quadruplets in the array which
 * gives the sum of target. 
 * For example, given array S = [1, 0, -1, 0, -2, 2],
 * and target = 0.
 * 
 * A solution set is: [ [-1, 0, 0, 1], [-2, -1, 1, 2], [-2, 0, 0, 2] ]
 *
 */
public class fourSumArr {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> l = new LinkedList<>();
		int lo = 0;
		int hi = nums.length - 1;
		int sum = 0;
		for (int i = 0; i < nums.length - 3; i++) {
			if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target)
				break;
			if (nums[i] + nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3] < target)
				continue;
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			for (int j = i + 1; j < nums.length - 2; j++) {
				if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target)
					break;
				lo = j + 1;
				hi = nums.length - 1;
				if (j > i + 1 && nums[j] == nums[j - 1])
					continue;
				while (lo < hi) {
					sum = nums[i] + nums[j] + nums[lo] + nums[hi];
					if (sum == target) {
						l.add(Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]));
						while (lo < hi && nums[lo] == nums[lo + 1])
							lo++;
						while (lo < hi && nums[hi] == nums[hi - 1])
							hi--;
						lo++;
						hi--;
					} else if (sum < target) {
						lo++;
					} else {
						hi--;
					}
				}
			}
		}
		return l;

	}

	public static void main(String[] args) {
		int nums[] = { 1, 0, -1, 0, -2, 2 };
		int target = 0;
		System.out.println(new fourSumArr().fourSum(nums, target));
	}
}
