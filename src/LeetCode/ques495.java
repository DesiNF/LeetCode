package LeetCode;

import java.util.*;

public class ques495 {
	public int findPoisonedDuration(int[] timeSeries, int duration) {
		int cnt=0;
		if(timeSeries.length==0||timeSeries==null)return cnt;
		for(int i=0;i<timeSeries.length-1;i++){
			for(int k=0;k<duration;k++){
				if(timeSeries[i]+k!=timeSeries[i+1])
					cnt++;
				else {
					break;
				}
			}
		}
		return cnt+duration;
	}

	public static void main(String[] args) {
		int timeSeries[]={1,4};
		int duration=2;
		System.out.println(new ques495().findPoisonedDuration(timeSeries, duration));
	}
}
