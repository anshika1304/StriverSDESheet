// https://leetcode.com/problems/single-element-in-a-sorted-array/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            else if(nums[mid]==nums[mid-1]){
                if(((mid-1)-start)%2==0){
                    start=mid+1;
                }
                else{
                    end=mid-2;
                }
            }
            else{
                if((end-(mid+1))%2==0){
                    end=mid-1;
                }
                else{
                    start=mid+2;
                }
            }
        }
        return nums[start];
    }
}
