package LeetCode;

import java.util.*;

public class ques167 {
	public int[] twoSum(int[] numbers, int target) {
		int index[]=new int [2];
		if(numbers.length<=1)
			return index;
		int l=0;
		int r=numbers.length-1;
		while (l<=r) {
			if(numbers[l]+numbers[r]==target){
				index[0]=l+1;
				index[1]=r+1;
				return index;
			}
			else if(numbers[l]+numbers[r]<target)l++;
			else r--;
		}
		return index;
	}

	public static void main(String[] args) {
		int nums[] = {2,7,11,15};
		int target = 9;
		int[] sum = new ques167().twoSum(nums, target);
		System.out.println("["+sum[0]+","+sum[1]+"]");
	}
}
