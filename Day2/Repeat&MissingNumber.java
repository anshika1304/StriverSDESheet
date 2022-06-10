// https://bit.ly/3Gs6wZu

import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int[] map=new int[n+1];
        for(int i=0; i<arr.size(); i++){
            map[arr.get(i)]++;
        }
        int[] ans=new int[2];
        for(int i=0; i<map.length; i++){
            if(map[i]==0){
                ans[0]=i;
            }
            else if(map[i]==2){
                ans[1]=i;
            }
        }
        return ans;
    }
}
