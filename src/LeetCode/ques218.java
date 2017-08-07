package LeetCode;

import java.util.*;

public class ques218 {
	public boolean containsDuplicate(int[] nums,int k) {
		Map<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				if(Math.abs(i-map.get(nums[i]))<=k)
					return true;
			}
			map.put(nums[i], i);
		}
		return false;
	}

	public static void main(String[] args) {
		int nums[]={1,2,3,4,5,6,7,8,1};
		int k=7;
		System.out.println(new ques218().containsDuplicate(nums,k));
	}
}
