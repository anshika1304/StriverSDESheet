// https://bit.ly/3zV52ob

import java.util.*;
public class Solution {

    public static int chessTournament(int[] positions, int n,  int c) 
	{
        Arrays.sort(positions);
        int low=1;
        int high=positions[n-1]-positions[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            int count=0;
            for(int i=0,prev=-1; i<positions.length; i++){
                if(prev==-1 || positions[i]-positions[prev]>=mid){
                    prev=i;
                    count++;
                }
            }
            if(count>=c){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
    }

}
