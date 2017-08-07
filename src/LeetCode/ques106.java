package LeetCode;

import java.util.*;

public class ques106 {
	public TreeNode buildTree(int[] inorder,int[] postorder) {
		int postLen=postorder.length;
		int inLen=inorder.length;
		return buildTree(postorder,0,postLen-1, inorder,0,inLen-1);
	}
	

	private TreeNode buildTree(int[] post, int postStart, int postEnd, int[] in, int inStart, int inEnd) {
		if(inStart>inEnd||postStart>postEnd)
			return null;
		int rootVal=post[postEnd];
		int rootIndex=0;
		for(int i=inStart;i<=inEnd;i++){
			if(in[i]==rootVal){
				rootIndex=i;
				break;
			}
		}
		int len=rootIndex-inStart;
		TreeNode root=new TreeNode(rootVal);
		root.left=buildTree(post, postStart, postStart+len-1, in, inStart, rootIndex-1);
		root.right=buildTree(post, postEnd-(inEnd-rootIndex), postEnd-1, in, rootIndex+1, inEnd);
		return root;
	}
	
	


	public static void main(String[] args) {
		int []postorder={4,5,2,6,7,3,1};
		int []inorder={4,2,5,1,6,3,7};
		TreeNode tree = new ques106().buildTree(inorder, postorder);
		System.out.println(tree);
	}
}

