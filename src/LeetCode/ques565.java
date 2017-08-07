package LeetCode;

import java.util.*;

public class ques565 {
	public int arrayNesting(int[] nums) {
		int cur=0;
		int next=0;
		int res=0;
		boolean used[]=new boolean[nums.length];
		for(int start=0;start<nums.length;start++){
			if(used[start]==false){
				int cnt=1;
				cur=start;
				next=nums[cur];
				while(next!=start){
					cnt++;
					cur=next;
					next=nums[cur];
					used[cur]=true;
				}
				res=Math.max(res, cnt);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int nums[] = {5,4,0,3,1,6,2};
		System.out.println(new ques565().arrayNesting(nums));
	}
}
