// https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        // Moore Voting Algorithm
        int count=0;
        int candidate=0;
        for(int num:nums){
            if(count==0){
                candidate=num;
            }
            if(num==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
        
        // int x=nums.length/2;
        // for(int num:nums){
        //     int count=0;
        //     for(int elem:nums){
        //         if(num==elem){
        //             count++;
        //         }
        //     }
        //     if(count>x){
        //         return num;
        //     }
        // }
        // return -1;
    }
}
