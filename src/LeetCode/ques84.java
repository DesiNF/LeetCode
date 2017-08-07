package LeetCode;

import java.util.*;

/**
 * Largest Rectangle in Histogram
 * 
 * @author Administrator
 *
 */
public class ques84 {
	public int largestRectangleArea(int[] heights) {
		if(heights.length==0||heights==null)
			return 0;
		Stack<Integer> stk=new Stack<>();
		int len=heights.length;
		int maxArea=0;
		for(int i=0;i<len;i++){
			if(stk.empty()||stk.peek()<=heights[i])
				stk.push(heights[i]);
			else {
				int count=0;
				while (!stk.empty()&&stk.peek()>heights[i]) {
					count++;
					maxArea=Math.max(maxArea, stk.peek()*count);
					stk.pop();
				}
				while (count-->0) {
					stk.push(heights[i]);
				}
				stk.push(heights[i]);
			}
		}
		int count=1;
		while (!stk.empty()) {
			maxArea=Math.max(maxArea, stk.peek()*count);
			stk.pop();
			count++;
		}
		return maxArea;
	}

	public static void main(String[] args) {
		int heights[] = { 2, 1, 5, 6, 2, 3 };
		System.out.println(new ques84().largestRectangleArea(heights));
	}
}
