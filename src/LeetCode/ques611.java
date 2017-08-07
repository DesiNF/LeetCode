package LeetCode;

import java.util.*;

public class ques611 {
	public int triangleNumber(int[] nums) {
		int count = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i : nums) list.add(i);
		list.sort(null);
		for(int i=0;i<list.size();i++){
			for(int j=i+1;j<list.size();j++){
				int sum=list.get(i)+list.get(j);
				int l=j;
				int r=list.size();
				while (r-1>l) {
					int mid=(l+r)/2;
					if(sum<=list.get(mid)) r=mid;
					if(sum>list.get(mid)) l=mid;
				}
				count+=l-j;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int nums[] = {2,2,3,4};
		System.out.println(new ques611().triangleNumber(nums));
	}
}
