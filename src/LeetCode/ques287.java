package LeetCode;

import java.util.*;

public class ques287 {
	//时间 O(NlogN) 空间 O(1)
	public int findDuplicate(int[] nums) {
		int min=0;
		int max=nums.length-1;
		while(min<=max){
			int mid=(min+max)/2;
			int cnt=0;
			for(int i=0;i<nums.length;i++){
				if(nums[i]<=mid){
					cnt++;
				}
			}
			// 如果小于等于中间数的数量大于中间数，说明前半部分必有重复
			if(cnt>mid)max=mid-1;
			else min=mid+1;
		}
		return min;
	}
	//时间 O(N) 空间 O(1)
	public int findDuplicate1(int[] nums) {
		int slow=0;
		int fast=0;
		do {
			slow=nums[slow];
			fast=nums[nums[fast]];
		} while (slow!=fast);
		int find=0;
		while (find!=slow) {
			slow=nums[slow];
			find=nums[find];
		}
		return find;
	}

	public static void main(String[] args) {
		int nums[] = {1,2,1,3,4};
		System.out.println(new ques287().findDuplicate1(nums));
	}
}
