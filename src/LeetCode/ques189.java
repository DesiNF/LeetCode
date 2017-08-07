package LeetCode;

import java.util.*;


public class ques189 {
	public void rotate(int[] nums, int k) {
		k%=nums.length;
		reverse(nums,0,nums.length-1);
		reverse(nums, 0, k-1);
		reverse(nums, k, nums.length-1);
	}
	public void reverse(int[]nums,int start,int end){
		while (start<end) {
			int temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
	}
	
	public void rotate1(int[] nums, int k) {  
        int[] a = new int[nums.length];  
        for (int i = 0; i < nums.length; i++) {  
            a[(i + k) % nums.length] = nums[i];  
        }  
        for (int i = 0; i < nums.length; i++) {  
            nums[i] = a[i];  
        }  
    }

	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,6,7 };
		new ques189().rotate1(nums, 3);
		for (int i : nums) {
			System.out.print(i+" ");
		}
	}
}
