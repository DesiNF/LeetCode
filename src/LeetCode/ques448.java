package LeetCode;

import java.util.*;

public class ques448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer>res=new ArrayList<>();
		Arrays.sort(nums);
		int a[]=new int [nums.length+1];
		Arrays.fill(a, -1);
		for(int i=0;i<nums.length;i++){
			a[nums[i]]=1;
		}
		for(int i=1;i<a.length;i++){
			if(a[i]<0)res.add(i);
		}
		return res;
	}

	public static void main(String[] args) {
		int nums[] = {1,1};
		
		System.out.println(new ques448().findDisappearedNumbers(nums));
	}
}
