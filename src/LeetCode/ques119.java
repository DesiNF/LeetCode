package LeetCode;

import java.util.*;

public class ques119 {
	public List<Integer> getRow(int rowIndex) {
		List<Integer>res=new ArrayList<>();
		if(rowIndex<0)
			return res;
		res.add(1);
		for(int i=1;i<=rowIndex;i++){
			for(int j=res.size()-2;j>=0;j--){
				res.set(j+1, res.get(j)+res.get(j+1));
			}
			res.add(1);
		}
		return res;
	}

	public static void main(String[] args) {
		int rowIndex=5;
		List<Integer> row = new ques119().getRow(rowIndex);
		System.out.println(row);
	}
}
