package LeetCode;

import java.util.*;

public class ques55 {
	public List<Interval> merge(List<Interval> intervals) {
		List<Interval> ans=new ArrayList<>();
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
		list.add(new Interval(1,3));
		list.add(new Interval(2,6));
		list.add(new Interval(8,10));
		list.add(new Interval(15,18));
		List<Interval> merge = new ques55().merge(list);
		for (Interval interval : merge) {
			System.out.println(interval);
		}
	}
}

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}

	@Override
	public String toString() {
		return "[" + start + ", " + end + "]";
	}
	
}
