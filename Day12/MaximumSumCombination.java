// https://www.codingninjas.com/codestudio/problems/k-max-sum-combinations_975322?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.util.*;
public class Solution{
	public static ArrayList<Integer> kMaxSumCombination(ArrayList<Integer> a, ArrayList<Integer> b, int n, int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>(k);
        for(int i=0; i<a.size(); i++){
            for(int j=0; j<b.size(); j++){
                if(pq.size()<k){
                    pq.add(a.get(i)+b.get(j));
                }
                else{
                    if(a.get(i)+b.get(j)>pq.peek()){
                        pq.poll();
                        pq.add(a.get(i)+b.get(j));
                    }
                }
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(!pq.isEmpty()){
            ans.add(0, pq.poll());
        }
        return ans;
	}
}
