// https://bit.ly/33AHZTz

import java.util.ArrayList;
import java.util.*;

public class Solution
{
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		int start=1;
        int end=1000000000;
        int n=matrix.size();
        int m=matrix.get(0).size();
        while(start<=end){
            int mid=start+(end-start)/2;
            int count=0;
            for(int i=0; i<n; i++){
                count += countSmallerThanMid(matrix.get(i), mid);
            }
            if(count<=(n*m)/2){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
	}
    static int countSmallerThanMid(ArrayList<Integer> list, int mid){
        int start=0;
        int end=list.size()-1;
        while(start<=end){
            int m=start+(end-start)/2;
            if(list.get(m)<=mid){
                start=m+1;
            }
            else{
                end=m-1;
            }
        }
        return start;
    }
}
