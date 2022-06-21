// https://leetcode.com/problems/combination-sum/

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }
    static void helper(int index, int[] arr, int target, List<Integer> list, List<List<Integer>> ans){
        if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[index]<=target){
            list.add(arr[index]);
            helper(index, arr, target-arr[index], list, ans);
            list.remove(list.size()-1);
        }
        helper(index+1, arr, target, list, ans);
    }
}
