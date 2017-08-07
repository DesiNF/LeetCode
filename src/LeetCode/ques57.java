package LeetCode;

import java.util.*;

public class ques57 {
	public List<Interval> insert(List<Interval> intervals,Interval newInterval) {
		List<Interval> ans=new ArrayList<>();
		intervals.add(newInterval);
		if(intervals.size()==0)return ans;
		Collections.sort(intervals,new Comparator<Interval>() {
			public int compare(Interval a, Interval b) {
				return a.start-b.start;
			}
		});
		int start=intervals.get(0).start;
		int end=intervals.get(0).end;
		for(int i=0;i<intervals.size();i++){
			Interval inter=intervals.get(i);
			if(inter.start>end){
				ans.add(new Interval(start,end));
				start=inter.start;
				end=inter.end;
			}else {
				end=Math.max(end, inter.end);
			}
		}
		ans.add(new Interval(start,end));
		return ans;
	}

	public static void main(String[] args) {
		List<Interval> list=new ArrayList<>();
		list.add(new Interval(1,2));
		list.add(new Interval(3,5));
		list.add(new Interval(6,7));
		list.add(new Interval(8,10));
		list.add(new Interval(12,16));
		List<Interval> merge = new ques57().insert(list,new Interval(4,9));
		for (Interval interval : merge) {
			System.out.println(interval);
		}
	}
}

