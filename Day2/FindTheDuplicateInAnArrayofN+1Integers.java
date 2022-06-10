// https://leetcode.com/problems/find-the-duplicate-number/

class Solution {
    public int findDuplicate(int[] nums) {
        // linked list cycle method(most optimal O(n))
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        fast=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
        
        // comparison(O(nlogn))
        // Arrays.sort(nums);
        // for(int i=1; i<=nums.length-1; i++){
        //     if(nums[i]==nums[i-1] || nums[i]==nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return 0;
        
        // mapping(TC-O(n), SC-O(n))
        // int[] map=new int[100001];
        // for(int i=0; i<nums.length; i++){
        //     map[nums[i]]++;
        // }
        // for(int i=0; i<map.length; i++){
        //     if(map[i]>1){
        //         return i;
        //     }
        // }
        // return 0;
    }
}
