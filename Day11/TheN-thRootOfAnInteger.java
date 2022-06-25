// https://bit.ly/3rj7Ib1

public class Solution {
    public static double findNthRootOfM(int n, long m) {
    double start=1, end=m, mid=0;
        while(start<end){
            mid=start+(end-start)/2;
            if(Math.pow(n,mid)==m){
                return mid;
            }
            else if(Math.pow(n,mid)>m){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return Math.pow(m, (double)1/n);
    }
}
