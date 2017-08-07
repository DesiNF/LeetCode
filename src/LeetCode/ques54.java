package LeetCode;

import java.util.*;

public class ques54 {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer>res=new LinkedList<>();
		if(matrix.length==0)return res;
		int m=matrix.length,n=matrix[0].length;
		int lvl=(Math.min(m, n)+1)/2;
		for(int i=0;i<lvl;i++){
			//最后一行
			int lastRow=m-i-1;
			//最后一列
			int lastCol=n-i-1;
			if(i==lastRow){
				for(int j=i;j<=lastCol;j++){
					res.add(matrix[i][j]);
				}
			}else if(i==lastCol){
				for(int j=i;j<=lastRow;j++){
					res.add(matrix[j][i]);
				}
			}else {
				for(int j=i;j<lastCol;j++)
					res.add(matrix[i][j]);
				for(int j=i;j<lastRow;j++)
					res.add(matrix[j][lastCol]);
				for(int j=lastCol;j>i;j--)
					res.add(matrix[lastRow][j]);
				for(int j=lastRow;j>i;j--)
					res.add(matrix[j][i]);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
		List<Integer> list = new ques54().spiralOrder(matrix);
		System.out.println(list);

	}
}
