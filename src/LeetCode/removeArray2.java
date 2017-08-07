package LeetCode;

public class removeArray2 {
	public int removeDuplicates(int[] nums) {
		if (nums.length<=2)
			return nums.length;
		int cur = 1;
		int temp = nums[1];
		for(int i=2;i<nums.length;i++){
			if(nums[i]!=nums[i-2]){
				nums[cur++]=temp;
				temp=nums[i];
			}
		}
		nums[cur++]=temp;
		return cur;
	}

	public static void main(String[] args) {
		int nums[] = { 1,1,1,2,2,3 };
		System.out.println(new removeArray2().removeDuplicates(nums));
	}
}
