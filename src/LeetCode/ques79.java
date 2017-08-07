package LeetCode;

public class ques79 {
	/**
	 * Word Search
	 */
	public boolean exist(char[][] board, String word) {
		if(word==null||word.length()==0)
			return true;
		if (board==null||board.length==0||board[0].length==0)
			return false;
		boolean [][]used=new boolean[board.length][board[0].length];
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				//if(search(board,word,0,i,j,used))
				if(dfs(board, i, j, word, 0))
					return true;
			}
		}
		return false;
	}
	private boolean dfs(char[][] board, int i, int j, String word, int idx) {  
	    if (idx == word.length())  
	        return true;  
	    if (i < 0 || i >= board.length || j < 0 || j >= board[i].length  
	    || board[i][j] != word.charAt(idx))  
	        return false;  
	      
	    char temp = board[i][j];  
	    board[i][j] = '0';  
	    if (dfs(board, i - 1, j, word, idx + 1)  
	    || dfs(board, i + 1, j, word, idx + 1)  
	    || dfs(board, i, j - 1, word, idx + 1)  
	    || dfs(board, i, j + 1, word, idx + 1)) {  
	        board[i][j] = temp;  
	        return true;  
	    }  
	      
	    board[i][j] = temp;  
	    return false;  
	}  
	public boolean search(char[][] board, String word,int index,int i,int j,boolean [][]used){
		if(index==word.length())
			return true;
		if(i<0||j<0||i>=board.length||j>=board[0].length||used[i][j]||board[i][j]!=word.charAt(index))
			return false;
		used[i][j]=true;
		boolean res=search(board, word, index+1, i-1, j, used)
				  ||search(board, word, index+1, i+1, j, used)
				  ||search(board, word, index+1, i, j-1, used)
				  ||search(board, word, index+1, i, j+1, used);
		used[i][j]=false;
		return res;
	}
	public static void main(String[] args) {
		char [][]board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word="ABCCED";
		System.out.println(new ques79().exist(board, word));
	}
}
