package LeetCode;

import java.util.*;

public class ques287 {
	//ʱ�� O(NlogN) �ռ� O(1)
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
			// ���С�ڵ����м��������������м�����˵��ǰ�벿�ֱ����ظ�
			if(cnt>mid)max=mid-1;
			else min=mid+1;
		}
		return min;
	}
	//ʱ�� O(N) �ռ� O(1)
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
