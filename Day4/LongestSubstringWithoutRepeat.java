// https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0, max=0, curr=0;
        while(i<s.length()){
            HashSet<Integer> set=new HashSet<>();
            while(i<s.length()){
                int val=(int)s.charAt(i);
                if(!set.contains(val)){
                    set.add(val);
                    curr++;
                    i++;
                }
                else{
                    max=Math.max(max, curr);
                    int removeVal=(int)s.charAt(i-curr);
                    set.remove(removeVal);
                    curr--;
                }
            }
        }
        max=Math.max(max, curr);
        return max;
    }
}
