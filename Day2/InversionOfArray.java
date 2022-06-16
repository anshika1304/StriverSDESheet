// https://www.codingninjas.com/codestudio/problems/count-inversions_615

import java.util.* ;
import java.io.*; 
public class Solution {
    static long count=0;
    public static long getInversions(long arr[], int n) {
        mergeSort(arr, 0, n);
        return count;
    }
    static void mergeSort(long[] arr, int start, int end){
        if((end-start)==1){
            return;
        }
        int mid=start+(end-start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr, start, mid, end);
    }
    static void merge(long[] arr, int start, int mid, int end){
        long[] ans=new long[end-start];
        int i=start, j=mid, k=0;
        while(i<mid && j<end){
            if(arr[i]<=arr[j]){
                ans[k]=arr[i++];
            }
            else{
                count += (mid-i);
                ans[k]=arr[j++];
            }
            k++;
        }
        while(i<mid){
            ans[k++]=arr[i++];
        }
        while(j<end){
            ans[k++]=arr[j++];
        }
        System.arraycopy(ans, 0, arr, start+0, ans.length);
    }
}
