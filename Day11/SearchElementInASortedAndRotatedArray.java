// https://leetcode.com/problems/search-in-rotated-sorted-array/

class Solution {
    public int search(int[] nums, int target) {
        int peakIndex=peak(nums);
        int ans=0;
        if(peakIndex!=-1){
            ans=search(nums, target, 0, peakIndex);
            if(ans==-1){
                ans=search(nums, target, peakIndex+1, nums.length-1);
            }
            return ans;
        }
        return search(nums, target, 0, nums.length-1);
    }
    int peak(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(end>mid && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(start<mid && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[start]>=nums[mid]){
                end=mid-1;
            }
            else if(nums[start]<nums[mid]){
                start=mid;
            }
        }
        return -1;
    }
    int search(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid=start+(end-start);
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
