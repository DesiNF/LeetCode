package LeetCode;

import java.awt.Frame;
import java.util.*;

public class ques414 {
	public int thirdMax(int[] nums) {
		int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;
		boolean a=false;
		for(int i:nums){
			if(i==Integer.MIN_VALUE)
				a=true;
			if(i>first){
				third=second;
				second=first;
				first=i;
			}else if(i>second&&i<first){
				third=second;
				second=i;
			}else if(i>third&&i<second) third=i;
		}
		return ((!a&&third==Integer.MIN_VALUE)||third==second)?first:third;
	}

	public static void main(String[] args) {
		int nums[] = {1,2};
			System.out.print(new ques414().thirdMax(nums));
	}
}
