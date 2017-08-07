package LeetCode;

import java.util.*;

public class ques48 {
	public void rotate(int[][] matrix) {
		if(matrix == null || matrix.length==0 || matrix[0].length==0)  
	        return;
		int n=matrix.length;
		int ln=matrix.length/2;
		for(int i=0;i<ln;i++){
			for(int j=i;j<matrix.length-1-i;j++){
				int temp=matrix[i][j];
				matrix[i][j]=matrix[n-1-j][i];
				matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
				matrix[j][n-1-i]=temp;
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix = {{1,2},{3,4} };
		new ques48().rotate(matrix);
		for (int[] is : matrix) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
