// https://leetcode.com/problems/merge-sorted-array/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index=nums1.length-1, i, j;
        for(i=m-1,j=n-1; i>=0&&j>=0;){
            if(nums1[i]>nums2[j]){
                nums1[index]=nums1[i];
                i--;
            }
            else{
                nums1[index]=nums2[j];
                j--;
            }
            index--;
        }
        while(j>=0){
            nums1[j]=nums2[j];
            j--;
        }
    }
}
