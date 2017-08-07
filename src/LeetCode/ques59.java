package LeetCode;

import java.util.*;

public class ques59 {
	public int[][] generateMatrix(int n) {
		int matrix[][]=new int[n][n];
		if(n==0)return matrix;
		int lvl=(n+1)/2;
		int count=1;
		for(int i=0;i<lvl;i++){
			int last=n-i-1;
			if(i==last){
				for(int j=i;j<=last;j++){
					matrix[i][j]=count;
					count++;
				}
			}else{
				for(int j=i;j<last;j++){
					matrix[i][j]=count;
					count++;
				}
				for(int j=i;j<last;j++){
					matrix[j][last]=count;
					count++;
				}
				for(int j=last;j>i;j--){
					matrix[last][j]=count;
					count++;
				}
				for(int j=last;j>i;j--){
					matrix[j][i]=count;
					count++;
				}
			}
		}
		return matrix;
	}

	public static void main(String[] args) {
		int [][]matrix=new ques59().generateMatrix(5);
		for (int[] is : matrix) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
