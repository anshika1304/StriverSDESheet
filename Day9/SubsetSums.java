// https://practice.geeksforgeeks.org/problems/subset-sums2234/1

class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> ans=new ArrayList<>();
        subsetSum(0, 0, arr, ans);
        Collections.sort(ans);
        return ans;
    }
    void subsetSum(int index, int sum, ArrayList<Integer> arr, ArrayList<Integer> ans){
        if(index==arr.size()){
            ans.add(sum);
            return;
        }
        subsetSum(index+1, sum+arr.get(index), arr, ans);
        subsetSum(index+1, sum, arr, ans);
    }
}
