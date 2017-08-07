package LeetCode;
import java.util.*;
public class ques40 {
	List<List<Integer>> res=new ArrayList<List<Integer>>();
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		backTracking(new ArrayList(),candidates,0,target);
		return res;
	}
	public void backTracking(List<Integer> cur,int[]candidates ,int from,int target){
		if(target==0){
			boolean exist=false;
			for(int i=res.size()-1;i>=0;i--){
				List<Integer>temp=res.get(i);
				if(temp.size()!=cur.size())
					continue;
				int j=0;
				while (j<cur.size()&&temp.get(j)==cur.get(j)) {
					j++;
				}
				if(j==cur.size()){
					exist=true;
					break;
				}
			}
			if(!exist){
			List<Integer>list=new ArrayList<>(cur);
			res.add(list);
			}
			return ;
		}
			for(int i=from;i<candidates.length&&candidates[i]<=target;i++){
				cur.add(candidates[i]);
				backTracking(cur, candidates, i+1, target-candidates[i]);
				cur.remove(new Integer(candidates[i]));
			}
	}
	public static void main(String[] args) {
		int []candidates={10, 1, 2, 7, 6, 1, 5};
		int target=8;
		ques40 q=new ques40();
		List<List<Integer>> list = q.combinationSum2(candidates, target);
		for (List<Integer> list2 : list) {
			System.out.println(list2);
		}
	}
}
