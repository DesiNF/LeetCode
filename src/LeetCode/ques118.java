package LeetCode;

import java.util.*;

public class ques118 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>>res=new ArrayList<>();
		if(numRows<=0)
			return res;
		List<Integer>pre=new ArrayList<>();
		pre.add(1);
		res.add(pre);
		for(int i=1;i<numRows;i++){
			List<Integer>cur=new ArrayList<>();
			cur.add(1);
			for(int j=0;j<pre.size()-1;j++){
				cur.add(pre.get(j)+pre.get(j+1));
			}
			cur.add(1);
			res.add(cur);
			pre=cur;
		}
		return res;
	}
	public static void main(String[] args) {
		int numRows=5;
		List<List<Integer>> generate = new ques118().generate(numRows);
		for (List<Integer> list : generate) {
			System.out.println(list);
		}
	}
}
