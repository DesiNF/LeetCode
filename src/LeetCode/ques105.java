package LeetCode;

import java.util.*;

public class ques105 {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		int preLen=preorder.length;
		int inLen=inorder.length;
		return buildTree(preorder,0,preLen-1, inorder,0,inLen-1);
	}
	

	private TreeNode buildTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
		if(inStart>inEnd||preStart>preEnd)
			return null;
		int rootVal=pre[preStart];
		int rootIndex=0;
		for(int i=inStart;i<=inEnd;i++){
			if(in[i]==rootVal){
				rootIndex=i;
				break;
			}
		}
		int len=rootIndex-inStart;
		TreeNode root=new TreeNode(rootVal);
		root.left=buildTree(pre, preStart+1, preStart+len, in, inStart, rootIndex-1);
		root.right=buildTree(pre, preStart+len+1, preEnd, in, rootIndex+1, inEnd);
		return root;
	}


	public static void main(String[] args) {
		int []preorder={1,2,4,5,3,6,7};
		int []inorder={4,2,5,1,6,3,7};
		TreeNode tree = new ques105().buildTree(preorder, inorder);
		System.out.println(tree);
	}
}
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int val) {
		super();
		this.val = val;
	}
	@Override
	public String toString() {
		return "TreeNode [val=" + val + ", left=" + left + ", right=" + right + "]";
	}
	
}
