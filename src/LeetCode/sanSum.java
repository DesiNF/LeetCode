package LeetCode;
import java.util.*;
public class sanSum {
	/**
	 * Array 15
	 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
	 */
	List<List<Integer>> ret=new ArrayList<List<Integer>>();
	public List<List<Integer>> threeSum(int[] nums) {
		if(nums.length<3||nums==null)
			return ret;
		Arrays.sort(nums);
		for(int i=0;i<nums.length-2;i++){
			if(i>0&&nums[i]==nums[i-1]) continue;
			find(nums,i+1,nums.length-1,nums[i]);
		}
		return ret;
	}
	public void find(int[] nums,int l,int r,int target){
		while (l<r) {
			if(nums[l]+nums[r]+target==0){
				List<Integer>ans=new ArrayList<>();
				ans.add(nums[l]);
				ans.add(target);
				ans.add(nums[r]);
				ret.add(ans);
				while (l<r&&nums[l]==nums[l+1]) {
					l++;
				}
				while (l<r&&nums[r]==nums[r-1]) {
					r--;
				}
				l++;
				r--;
			}else if (nums[l]+nums[r]+target<0) {
				l++;
			}else {
				r--;
			}
		}
	}
	public static void main(String[] args) {
		int nums[]={-1, 0, 1, 2, -1, -4};
		System.out.println(new sanSum().threeSum(nums));
	}
}
