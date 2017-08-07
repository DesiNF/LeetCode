package LeetCode;

public class ques34 {
	public int[] searchRange(int[] nums, int target) {
		int res[]={-1,-1};
		if(nums.length==0||nums==null)
			return res;
		int left=0;
		int right=nums.length-1;
		while (nums[left]<nums[right]) {
			int mid=(left+right)/2;
			if(nums[mid]>target)right=mid-1;
			else if(nums[mid]<target) left=mid+1;
			else {
				if(nums[left]<target) left++;
				if(nums[right]>target)right--;
			}
		}
		if(nums[left]==target){
			res[0]=left;
			res[1]=right;
		}
		return res;
		
	}
	public static void main(String[] args) {
		int nums[]={5, 7, 7, 8, 8, 10};
		int target=7;
		ques34 q=new ques34();
		int[] is = q.searchRange(nums, target);
		for (int i : is) {
			System.out.print(i+" ");
		}
	}
}
