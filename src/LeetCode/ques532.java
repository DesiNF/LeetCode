package LeetCode;

import java.util.*;

public class ques532 {
	//583ms
	public int findPairs(int[] nums, int k) {
		int count=0;
		int x=Integer.MAX_VALUE,y=Integer.MAX_VALUE;
		Arrays.sort(nums);
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]==x&&nums[j]==y)count--;
				if(Math.abs(nums[i]-nums[j])==k){
					x=nums[i];y=nums[j];
					count++;
				}
			}
		}
		return count;
	}
	public int findPairs1(int[] nums, int k) {
		if(nums==null||nums.length==0||k<0)
			return 0;
		Map<Integer, Integer> map=new HashMap<>();
		int i=0;
		for(int num:nums) map.put(num, i++);
		int res=0;
		for(i=0;i<nums.length;i++){
			if(map.containsKey(nums[i]+k)&&map.get(nums[i]+k)!=i){
				map.remove(nums[i]+k);
				res++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int nums[] = {3, 1, 4, 1, 5};
		System.out.println(new ques532().findPairs1(nums, 2));
	}
}
