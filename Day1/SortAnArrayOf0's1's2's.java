// https://leetcode.com/problems/sort-colors/

class Solution {
    public void sortColors(int[] nums) {
        // mapping
        // int[] map=new int[3];
        // for(int i=0; i<nums.length; i++){
        //     map[nums[i]]++;
        // }
        // int index=0;
        // for(int i=0; i<map.length; i++){
        //     while(map[i]-->0){
        //         nums[index++]=i;
        //     }
        // }
        
        // bubble sort
        // for(int i=0; i<nums.length; i++){
        //     for(int j=1; j<nums.length-i; j++){
        //         if(nums[j]<nums[j-1]){
        //             int temp=nums[j];
        //             nums[j]=nums[j-1];
        //             nums[j-1]=temp;
        //         }
        //     }
        // }
        
        // dnf sort
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
}
