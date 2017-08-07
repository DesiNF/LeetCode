package LeetCode;

import java.util.*;

public class ques169 {
	public int majorityElement(int[] nums) {
		int pre=0;
		int count=0;
		for(int i=0;i<nums.length;i++){
			if(count==0){
				pre=nums[i];
				count=1;
			}else{
				if(pre==nums[i])
					count++;
				else
					count--;
			}
		}
		return pre;
	}

	public static void main(String[] args) {
		int nums[] = {1,2,1,1,1,2,1,3,4,1 };
		System.out.println(new ques169().majorityElement(nums));
	}
}
