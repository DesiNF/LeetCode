package LeetCode;
import java.util.*;
public class ques39 {
	List<List<Integer>> res=new ArrayList<List<Integer>>();
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		backTracking(new ArrayList(),candidates,0,target);
		return res;
	}
	public void backTracking(List<Integer> cur,int[]candidates ,int from,int target){
		if(target==0){
			List<Integer>list=new ArrayList<>(cur);
			res.add(list);
		}else {
			for(int i=from;i<candidates.length&&candidates[i]<=target;i++){
				cur.add(candidates[i]);
				backTracking(cur, candidates, i, target-candidates[i]);
				cur.remove(new Integer(candidates[i]));
			}
		}
	}
	public static void main(String[] args) {
		int []candidates={2, 3, 6, 7};
		int target=6;
		ques39 q=new ques39();
		List<List<Integer>> list = q.combinationSum(candidates, target);
		for (List<Integer> list2 : list) {
			System.out.println(list2);
		}
	}
}
