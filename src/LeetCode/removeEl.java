package LeetCode;

/**
 * Given an array and a value, remove all instances of that value in place and
 * return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place with
 * constant memory.
 * 
 * The order of elements can be changed. It doesn't matter what you leave beyond
 * the new length.
 * 
 * Example: Given input array nums = [3,2,2,3], val = 3
 * 
 * Your function should return length = 2, with the first two elements of nums
 * being 2.
 * 
 * @author Administrator
 *
 */
public class removeEl {
	public int removeElement(int[] nums, int val) {
		if(nums.length==0)
			return 0;
		int cur=0;
		int index=0;
		while (index<nums.length) {
			if(nums[index]!=val)
				nums[cur++]=nums[index];
			index++;
		}
		for(int i=0;i<cur;i++)
			System.out.print(nums[i]+" ");
		System.out.println();
		return cur;
	}
	public static void main(String[] args) {
		int nums[]={3,2,2,3};
		int val=3;
		System.out.println(new removeEl().removeElement(nums, val));
	}
}
