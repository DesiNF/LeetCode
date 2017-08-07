package LeetCode;

import java.util.*;

public class ques128 {
	public int longestConsecutive(int[] nums) {
		int res=0;
		Set<Integer>s=new HashSet<>();
		for(int num:nums) s.add(num);
		for(int num:nums){
			if(s.remove(num)){
				int pre=num-1,next=num+1;
				while(s.remove(pre))--pre;
				while(s.remove(next))++next;
				res=Math.max(res, next-pre-1);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int nums[] = {100, 4, 200, 1, 3, 2 };
		System.out.println(new ques128().longestConsecutive(nums));
	}
}
