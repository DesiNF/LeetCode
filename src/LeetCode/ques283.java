package LeetCode;

import java.util.*;

public class ques283 {
	public void moveZeroes(int[] nums) {
		if(nums.length==0||nums==null)
			return ;
		int pos=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=0){
				nums[pos]=nums[i];
				pos++;
			}
		}
		for(int i=pos;i<nums.length;i++){
			nums[i]=0;
		}
	}

	public static void main(String[] args) {
		int nums[] = {0, 1, 0, 3, 12};
		new ques283().moveZeroes(nums);
		for(int i:nums)
			System.out.print(i+" ");
	}
}
