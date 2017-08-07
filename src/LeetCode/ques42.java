package LeetCode;

import java.util.*;

public class ques42 {
	public int trap(int[] height) {
		if(height.length<2)
			return 0;
		int max=Integer.MIN_VALUE;
		int maxIn = 0;
		for(int i=0;i<height.length;i++){
			if(height[i]>max){
				max=height[i];
				maxIn=i;
			}
		}
		int area=0;
		for(int i=1,root=height[0];i<maxIn;i++){
			if(root<height[i]) root=height[i];
			else area+=(root-height[i]);
		}
		for(int i=height.length-1,root=height[height.length-1];i>maxIn;i--){
			if(root<height[i]) root=height[i];
			else area+=(root-height[i]);
		}
		return area;
	}

	public static void main(String[] args) {
		int[] height = { 0,1,0,2,1,0,1,3,2,1,2,1 };
		System.out.println(new ques42().trap(height));
	}
}
