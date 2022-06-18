// https://bit.ly/3npx0mW

import java.util.*;
public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        Arrays.sort(at);
        Arrays.sort(dt);
        int plat=1, ans=1;
        int i=1, j=0;
        while(i<n && j<n){
            if(at[i]<=dt[j]){
                plat++;
                i++;
            }
            else if(at[i]>dt[j]){
                plat--;
                j++;
            }
            if(plat>ans){
                ans=plat;
            }
        }
        return ans;
    }
}
