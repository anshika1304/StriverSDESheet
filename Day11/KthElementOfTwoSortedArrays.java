// https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1

class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
//         O(log min(n,m))
        if(n>m){
            return kthElement(arr2, arr1, m, n, k);
        }
        int start=Math.max(0, k-m);
        int end=Math.min(k, n);
        while(start<=end){
            int cut1=(start+end)>>1;
            int cut2=k-cut1;
            int l1=cut1==0?Integer.MIN_VALUE:arr1[cut1-1];
            int l2=cut2==0?Integer.MIN_VALUE:arr2[cut2-1];
            int r1=cut1==n?Integer.MAX_VALUE:arr1[cut1];
            int r2=cut2==m?Integer.MAX_VALUE:arr2[cut2];
            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            }
            else if(l1>r2){
                end=cut1-1;
            }
            else{
                start=cut1+1;
            }
        }
        return 1;
        
//         O(k)
//         int i=0, j=0, l=0;
//         while(i<n && j<m){
//             if(arr1[i]<arr2[j]){
//                 l++;
//                 if(l==k){
//                     return arr1[i];
//                 }
//                 i++;
//             }
//             else{
//                 l++;
//                 if(l==k){
//                     return arr2[j];
//                 }
//                 j++;
//             }
//         }
//         while(i<n){
//             l++;
//             if(l==k){
//                 return arr1[i];
//             }
//             i++;
//         }
//         while(j<m){
//             l++;
//             if(l==k){
//                 return arr2[j];
//             }
//             j++;
//         }
//         return -1;
    }
}
