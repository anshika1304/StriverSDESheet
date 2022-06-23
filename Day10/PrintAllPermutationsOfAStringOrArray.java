// https://leetcode.com/problems/permutations/

class Solution {
    // Approach-2(without extra space)
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        recurPermute(0, nums, ans);
        return ans;
    }
    void recurPermute(int index, int[] nums, List<List<Integer>> ans){
        if(index==nums.length){
            List<Integer> list=new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                list.add(nums[i]);
            }
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index; i<nums.length; i++){
            swap(i, index, nums);
            recurPermute(index+1, nums, ans);
            swap(i, index, nums);
        }
    }
    void swap(int i, int j, int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    // Approach-1
    // public List<List<Integer>> permute(int[] nums) {
    //     List<List<Integer>> ans=new ArrayList<>();
    //     boolean[] freq=new boolean[nums.length];
    //     recurPermute(nums, new ArrayList<>(), ans, freq);
    //     return ans;
    // }
    // void recurPermute(int[] nums, List<Integer> list, List<List<Integer>> ans, boolean[] freq){
    //     if(list.size()==nums.length){
    //         ans.add(new ArrayList<>(list));
    //         return;
    //     }
    //     for(int i=0; i<nums.length; i++){
    //         if(!freq[i]){
    //             freq[i]=true;
    //             list.add(nums[i]);
    //             recurPermute(nums, list, ans, freq);
    //             list.remove(list.size()-1);
    //             freq[i]=false;
    //         }
    //     }
    // }
}
