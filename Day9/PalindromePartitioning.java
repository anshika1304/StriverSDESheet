// https://leetcode.com/problems/palindrome-partitioning/

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        helper(0, s, new ArrayList<>(), ans);
        return ans;
    }
    static void helper(int index, String s, List<String> list, List<List<String>> ans){
        if(index==s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index; i<s.length(); i++){
            if(isPalindrome(s, index, i)){
                list.add(s.substring(index, i+1));
                helper(i+1, s, list, ans);
                list.remove(list.size()-1);
            }
        }
    }
    static boolean isPalindrome(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
