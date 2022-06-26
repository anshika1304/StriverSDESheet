// https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1

class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        int i=0, j=0, l=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                l++;
                if(l==k){
                    return arr1[i];
                }
                i++;
            }
            else{
                l++;
                if(l==k){
                    return arr2[j];
                }
                j++;
            }
        }
        while(i<n){
            l++;
            if(l==k){
                return arr1[i];
            }
            i++;
        }
        while(j<m){
            l++;
            if(l==k){
                return arr2[j];
            }
            j++;
        }
        return -1;
    }
}
