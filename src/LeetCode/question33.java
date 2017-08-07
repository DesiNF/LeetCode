package LeetCode;

import java.util.Scanner;
/**
 * 
 * @author Administrator
 *
 */
public class question33 {
	public int search(int[] nums, int target) {
		if (nums==null||nums.length==0) {
			return -1;
		}
		int left=0;
		int right=nums.length-1;
		while (left<=right) {
			int mid=(left+right)/2;
			if(nums[mid]==target)
				return mid;
			if(nums[left]==target)
				return left;
			if(nums[right]==target)
				return right;
			if(nums[left]<nums[right]){
				if(target<nums[left]||target>nums[right])return -1;
				else if(target<nums[mid]) right=mid-1;
				else  left=mid+1;
			}else if (nums[mid]<nums[right]) {
				if(target<nums[right]&&target>nums[mid]){
					left=mid+1;
				}else{
					right=mid-1;
				}
			}else{
				if(target>nums[left]&&target<nums[mid]){
					right=mid-1;
				}else
					left=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int nums[]={4,5,6,7,0,1,2};
		Scanner in=new Scanner(System.in);
		int target=in.nextInt();
		System.out.println(new question33().search(nums, target));
	}
}
