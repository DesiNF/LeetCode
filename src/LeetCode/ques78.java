package LeetCode;
import java.util.*;
public class ques78 {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res=new ArrayList<>();
		if(nums.length==0||nums==null)
			return res;
		List<Integer> list=new ArrayList<>();
		dfs(res,list,0,nums);
		return res;
	}
	public void dfs(List<List<Integer>> res,List<Integer> list,int start,int[] nums){
		res.add(new ArrayList<>(list));
		for(int i=start;i<nums.length;i++){
			list.add(nums[i]);
			dfs(res, list, i+1, nums);
			list.remove(list.size()-1);
		}
	}
	public static void main(String[] args) {
		int nums[]={1,2,3};
		List<List<Integer>> subsets = new ques78().subsets(nums);
		for (List<Integer> list : subsets) {
			System.out.println(list);
		}
	}
}
