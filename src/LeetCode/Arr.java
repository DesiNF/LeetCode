package LeetCode;


public class Arr {

	
	/**
	 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
	   Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
	 */
	public static void main(String[] args) {
		int nums1[]={1,2};		
		int nums2[]={3,4};
		System.out.println(new Arr().findMedianSortedArrays(nums1, nums2));
	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int n1=nums1.length;
		int n2=nums2.length;
		if(n1<n2)return findMedianSortedArrays(nums2, nums1);
		if(n2==0) return ((double) nums1[(n1-1)/2]+(double)nums1[n1/2])/2;
		int lo=0;
		int hi=n2*2;
		while (lo<=hi) {
			int mid2=(lo+hi)/2;
			int mid1=n1+n2-mid2;
			double l1=(mid1==0)?Integer.MIN_VALUE:nums1[(mid1-1)/2];
			double l2=(mid2==0)?Integer.MIN_VALUE:nums2[(mid2-1)/2];
			double r1=(mid1==n1*2)?Integer.MAX_VALUE:nums1[mid1/2];
			double r2=(mid2==n2*2)?Integer.MAX_VALUE:nums2[mid2/2];
			
			if (l1>r2) {
				lo=mid2+1;
			}else if (l2>r1) {
				hi=mid2-1;
			} else {
				return (Math.max(l1, l2)+Math.min(r1, r2))/2;
			}
		}
		return -1;
	}
	
}
