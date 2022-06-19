// https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1

class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        int[][] matrix=new int[n][2];
        for(int i=0; i<start.length; i++){
            matrix[i][0]=start[i];
            matrix[i][1]=end[i];
        }
        int activity=0, endi=-1;
        Arrays.sort(matrix, (a,b)->Double.compare(a[1],b[1]));
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][0]>endi){
                activity++;
                endi=matrix[i][1];
            }
        }
        return activity;
    }
}
