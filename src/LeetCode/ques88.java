package LeetCode;
import java.util.*;
/**
 * Largest Rectangle in Histogram
 * 
 * @author Administrator
 *
 */
public class ques88 {
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if(nums1==null||nums2==null)
			return;
		int index1=m-1;
		int index2=n-1;
		int len=m+n-1;
		while (index1>=0&&index2>=0) {
			if(nums1[index1]>nums2[index2])
				nums1[len--]=nums1[index1--];
			else {
				nums1[len--]=nums2[index2--];
			}
		}
		while (index2>=0) {
			nums1[len--]=nums2[index2--];
		}
	}

	public static void main(String[] args) {
		int nums1[]=new int[20];
		int nums2[]={1,2,3};
		for(int i=4;i<11;i++)
			nums1[i-4]=i;
		int m=7;
		int n=3;
		new ques88().merge(nums1, m, nums2, n);
		for (int i : nums1) {
			System.out.print(i+" ");
		}
	}
}
