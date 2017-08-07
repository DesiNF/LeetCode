package LeetCode;
import java.util.*;
public class ques90 {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res=new ArrayList<>();
		if(nums.length==0||nums==null)
			return res;
		Arrays.sort(nums);
		List<Integer> list=new ArrayList<>();
		dfs(res,list,0,nums);
		return res;
	}
	public void dfs(List<List<Integer>> res,List<Integer> list,int start,int[] nums){
		int i=start;
		res.add(new ArrayList<>(list));
		while(i<nums.length){
			list.add(nums[i]);
			dfs(res, list, i+1, nums);
			list.remove(list.size()-1);
			while (i<(nums.length-1)&&nums[i]==nums[i+1]) {
				i++;
			}
			i++;
		}
	}
	public static void main(String[] args) {
		int nums[]={4,4,4,1,4};
		List<List<Integer>> subsets = new ques90().subsets(nums);
		for (List<Integer> list : subsets) {
			System.out.println(list);
		}
	}
}
