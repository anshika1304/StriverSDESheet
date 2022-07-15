// https://leetcode.com/problems/maximum-product-subarray/

class Solution {
    public int maxProduct(int[] nums) {
        int ans=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            ans=Math.max(ans, nums[i]);
        }
        int currMin=1, currMax=1;
        for(int n:nums){
            if(n==0){
                currMin=1;
                currMax=1;
                continue;
            }
            int temp1=n*currMax;
            int temp2=n*currMin;
            currMax=Math.max(n, Math.max(temp1,temp2));
            currMin=Math.min(n, Math.min(temp1, temp2));
            ans=Math.max(ans, currMax);
        }
        return ans;
    }
}
