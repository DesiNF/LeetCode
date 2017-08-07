package LeetCode;

import java.util.*;

public class ques289 {
	public void gameOfLife(int[][] board) {
		int m=board.length;
		int n=board[0].length;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				int status=getStatus(board,m,n,i,j);
				if((board[i][j]==1||board[i][j]==3)&&(status==2||status==3)){
					board[i][j]=3;
				}else {
					board[i][j]=status==3?2:board[i][j];
				}
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				board[i][j]>>=1;
			}
		}
	}

	private int getStatus(int[][] board, int m, int n, int x, int y) {
		int live=0;
		for(int i=-1;i<2;i++){
			for(int j=-1;j<2;j++){
				int newX=x+i;
				int newY=y+j;
				if(newX==x&&newY==y)continue;
				if(newX>=0&&newY>=0&&newX<m&&newY<n){
					if(board[newX][newY]==1||board[newX][newY]==3)live++;
				}
			}
		}
		return live;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 1, 3, 4 };
	}
}
