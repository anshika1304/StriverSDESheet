// https://leetcode.com/problems/3sum/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int target=-nums[i];
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int twoSum=nums[j]+nums[k];
                if(twoSum==target){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    set.add(list);
                    j++;
                    k--;
                }
                else if(twoSum>target){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
