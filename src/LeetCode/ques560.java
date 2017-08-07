package LeetCode;

import java.util.*;

public class ques560 {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int m=nums.length;
		int n=nums[0].length;
		if((r*c)!=(m*n))return nums;
		int tmp[]=new int [m*n];
		int index=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				tmp[index]=nums[i][j];
				index++;
			}
		}
		index=0;
		int res[][]=new int [r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				res[i][j]=tmp[index];
				index++;
			}
		}
		return res;
				
	}

	public static void main(String[] args) {
		int nums[][] = {{1,2},{3,4}};
		int r = 1;
		int c=4;
		int[][] reshape = new ques560().matrixReshape(nums, r, c);
		for (int[] is : reshape) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
