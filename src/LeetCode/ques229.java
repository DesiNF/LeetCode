package LeetCode;

import java.util.*;

public class ques229 {
	public List<Integer> majorityElement(int[] nums) {
		List<Integer> res=new ArrayList<>();
		int m=0,n=0,cm=0,cn=0;
		for (int a : nums) {
			if(a==m)cm++;
			else if(a==n) cn++;
			else if(cm==0){
				m=a;cm=1;
			}
			else if(cn==0){
				n=a;cn=1;
			}else {
				cn--;cm--;
			}
		}
		cn=cm=0;
		for(int a:nums){
			if(a==m)cm++;
			else if(a==n)cn++;
		}
		if(cm>nums.length/3)res.add(m);
		if(cn>nums.length/3)res.add(n);
		return res;
	}

	public static void main(String[] args) {
		int nums[] = {1,2,2,2,2,3,3,3,3,4};
		System.out.println(new ques229().majorityElement(nums));
	}
}
