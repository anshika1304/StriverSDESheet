// https://leetcode.com/problems/powx-n/

class Solution {
    public double myPow(double x, int n) {
        if(n==Integer.MIN_VALUE){
            n=Integer.MAX_VALUE;
            x=Math.abs(1/x);
        }
        if(n<0){
            x=1/x;
            n=Math.abs(n);
        }
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return myPow(x*x, n/2);
        }
        return x*myPow(x*x, n/2);
    }
}
