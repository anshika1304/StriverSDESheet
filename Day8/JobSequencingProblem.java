// https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1#

class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        int jobs=0, profit=0;
        Arrays.sort(arr, (a,b)->Double.compare(a.profit,b.profit));
        HashSet<Integer> set=new HashSet<>();
        for(int i=arr.length-1; i>=0; i--){
            int j=arr[i].deadline-1;
            while(j>=0 && set.contains(j)){
                j--;
            }
            if(j>=0){
                set.add(j);
                jobs++;
                profit += arr[i].profit;
            }
        }
        return new int[]{jobs,profit};
    }
}
