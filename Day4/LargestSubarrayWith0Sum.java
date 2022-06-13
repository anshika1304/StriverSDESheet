// https://bit.ly/31UHoeM

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxlen=0;
        int sum=0;
        for(int i=0; i<arr.size(); i++){
            sum += arr.get(i);
            if(sum==0){
                maxlen=i+1;
            }
            else{
                if(map.get(sum)!=null){
                    maxlen=Math.max(maxlen, i-map.get(sum));
                }
                else{
                    map.put(sum, i);
                }
            }
        }
        return maxlen;
	}
}
