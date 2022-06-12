// https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // O(n)
        int[] ans=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                ans[0]=i;
                ans[1]=map.get(target-nums[i]);
            }
            map.put(nums[i], i);
        }
        return ans;
        
        // O(n^2)
        // int[] ans=new int[2];
        // for(int i=0; i<nums.length; i++){
        //     for(int j=0; j<nums.length; j++){
        //         if(i!=j && nums[i]+nums[j]==target){
        //             ans[0]=i;
        //             ans[1]=j;
        //             return ans;
        //         }
        //     }
        // }
        // return ans;
    }
}
