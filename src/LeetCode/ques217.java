package LeetCode;

import java.util.*;

public class ques217 {
	public boolean containsDuplicate(int[] nums) {
		Map<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i]))return true;
			map.put(nums[i], i);
		}
		return false;
	}

	public static void main(String[] args) {
		int nums[]={1,2,1,2,3,3,4,4};
		System.out.println(new ques217().containsDuplicate(nums));
	}
}
