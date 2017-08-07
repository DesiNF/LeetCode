package LeetCode;

import java.util.*;

public class ques628 {
	public int maximumProduct(int[] nums) {
		int len=nums.length;
		Arrays.sort(nums);
		int a=nums[len-1]*nums[len-2]*nums[len-3];
		int b=nums[0]*nums[1]*nums[len-1];
		return a>b?a:b;
	}

	public static void main(String[] args) {
		int flowerbed[] = {1,2,3 };
		System.out.println(new ques628().maximumProduct(flowerbed));

	}
}
