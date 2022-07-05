// https://www.codingninjas.com/codestudio/problems/min-heap_4691801?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website

import java.util.*;
public class Solution {

    // minHeap function which take size of Queries and Queries as Input.
// Returns an array out outputs depending on the query.
    static int[] minHeap(int n, int[][] q) {
        ArrayList<Integer> list=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0; i<n; i++){
            if(q[i][0]==0){
                pq.add(q[i][1]);
            }
            else{
                if(!pq.isEmpty()){
                    list.add(pq.poll());
                }
            }
        }
        return list.stream().mapToInt(i->i).toArray();

    }
}
