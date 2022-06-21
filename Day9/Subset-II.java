// https://leetcode.com/problems/subsets-ii/

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        findSubset(0, nums, new ArrayList<>(), ans);
        return ans;
    }
    static void findSubset(int index, int[] nums, List<Integer> list, List<List<Integer>> ans){
        ans.add(new ArrayList<>(list));
        for(int i=index; i<nums.length; i++){
            if(i!=index && nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            findSubset(i+1, nums, list, ans);
            list.remove(list.size()-1);
        }
    }
}
