package LeetCode;

/**
 * Arr 26
 * 
 * Given a sorted array, remove the duplicates in place such that each element
 * appear only once and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place with
 * constant memory.
 * 
 * For example, Given input array nums = [1,1,2],
 * 
 * Your function should return length = 2, with the first two elements of nums
 * being 1 and 2 respectively. It doesn't matter what you leave beyond the new
 * length.
 * 
 * @author Administrator
 *
 */
public class removeArray {
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int cur = 1;
		int pre = nums[0];
		int index = 1;
		while (index < nums.length) {
			if (nums[index] != pre)
				nums[cur++] = nums[index];
			pre = nums[index];
			index++;
		}
		for (int i : nums) {
			System.out.print(i + " ");
		}
		return cur;
	}

	public static void main(String[] args) {
		int nums[] = { -3, -1, 0, 0, 0, 3, 3 };
		System.out.println(new removeArray().removeDuplicates(nums));
	}
}
