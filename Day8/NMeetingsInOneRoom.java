// https://bit.ly/3zXdqn5

import java.util.*;
public class Solution {
    public static List<Integer> maximumMeetings(int[] start, int[] end) {
        int[][] matrix=new int[start.length][3];
        for(int i=0; i<start.length; i++){
            matrix[i][0]=i+1;
            matrix[i][1]=start[i];
            matrix[i][2]=end[i];
        }
        Arrays.sort(matrix, (a,b)->{
            if(a[2]==b[2]){
                return a[0]-b[0];
            }
            return a[2]-b[2];
        });
        List<Integer> ans=new ArrayList<>();
        int endi=-1;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][1]>endi){
                ans.add(matrix[i][0]);
                endi=matrix[i][2];
            }
        }
        return ans;
    }
}
