// https://www.codingninjas.com/codestudio/problems/merge-k-sorted-arrays_975379

import java.util.*;

public class Solution 
{
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0; i<kArrays.size(); i++){
            for(int j=0; j<kArrays.get(i).size(); j++){
                pq.add(kArrays.get(i).get(j));
            }
        }
		ArrayList<Integer> ans=new ArrayList<>();
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        return ans;
	}
}
