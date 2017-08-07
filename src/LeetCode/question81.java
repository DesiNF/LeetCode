package LeetCode;

import java.util.Scanner;
/**
 * 
 * @author Administrator
 *
 */
public class question81 {
	public boolean search(int[] nums, int target) {
		if(nums.length==0||nums==null)
			return false;
		int l=0;
		int r=nums.length-1;
		while (l<=r) {
			int m=(l+r)/2;
			if(nums[m]==target)
				return true;
			if(nums[m]>nums[l]){
				if(nums[m]>target&&nums[l]<=target) r=m-1;
				else l=m+1;
			}else if(nums[m]<nums[l]){
				if(nums[m]<target&&nums[r]>=target) l=m+1;
				else r=m-1;
			}else {
				l++;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int nums[]={4,5,6,7,0,1,2};
		Scanner in=new Scanner(System.in);
		int target=in.nextInt();
		System.out.println(new question81().search(nums, target));
		
	}
}
