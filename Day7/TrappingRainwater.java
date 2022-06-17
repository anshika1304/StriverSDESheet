// https://leetcode.com/problems/trapping-rain-water/

class Solution {
    public int trap(int[] height) {
        int left=0, right=height.length-1, maxLeft=0, maxRight=0, ans=0;
        while(left<=right){
            if(height[left]<=height[right]){
                if(maxLeft<=height[left]){
                    maxLeft=height[left];
                }
                else{
                    ans += maxLeft-height[left];
                }
                left++;
            }
            else{
                if(height[right]>=maxRight){
                    maxRight=height[right];
                }
                else{
                    ans += maxRight-height[right];
                }
                right--;
            }
        }
        return ans;
    }
}
