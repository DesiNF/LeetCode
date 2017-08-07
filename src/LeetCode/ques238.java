package LeetCode;

import java.util.*;

public class ques238 {
	public int[] productExceptSelf(int[] nums) {
		int n = nums.length, right = 1;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; ++i) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        for (int i = n - 1; i >= 0; --i) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
	}

	public static void main(String[] args) {
		int nums[] = {1,2,3,4};
		for(int i:new ques238().productExceptSelf(nums))
			System.out.print(i+" ");
	}
}
