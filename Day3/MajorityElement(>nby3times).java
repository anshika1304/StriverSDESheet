// https://leetcode.com/problems/majority-element-ii/

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Boyer Moore Voting Algorithm
        int num1=0, num2=0, count1=0, count2=0;
        for(int elem:nums){
            if(elem==num1){
                count1++;
            }
            else if(elem==num2){
                count2++;
            }
            else if(count1==0){
                num1=elem;
                count1=1;
            }
            else if(count2==0){
                num2=elem;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> ans=new ArrayList<>();
        count1=0;
        count2=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==num1){
                count1++;
            }
            else if(nums[i]==num2){
                count2++;
            }
        }
        if(count1>nums.length/3){
            ans.add(num1);
        }
        if(count2>nums.length/3){
            ans.add(num2);
        }
        return ans;
    }
}
