package LeetCode;

public class ques35 {
	public int searchInsert(int[] nums, int target) {
		if(nums.length==0||nums==null)
			return -1;
		if(target<=nums[0])
			return 0;
		if(target>nums[nums.length-1])
			return nums.length;
		for(int i=1;i<nums.length;i++){
			if(target>nums[i-1]&&target<=nums[i])return i;
		}
		return  0;
	}
	public static void main(String[] args) {
		int nums[]={1,3,5,6};
		int target=2;
		System.out.println(new ques35().searchInsert(nums, target));
	}
}
