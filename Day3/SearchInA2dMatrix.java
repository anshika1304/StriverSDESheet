// https://leetcode.com/problems/search-a-2d-matrix/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
//         logn
        int start=0; 
        int end=matrix.length-1;    
        int requiredRow=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(matrix[mid][0]==target){
                return true;
            }
            else if(matrix[mid][0]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        if(end==-1){
            return false;
        }
        requiredRow=end;
        start=0;
        end=matrix[0].length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(matrix[requiredRow][mid]==target){
                return true;
            }
            else if(matrix[requiredRow][mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
        
//         nlogn
//         for(int i=0; i<matrix.length; i++){
//             int start=0;
//             int end=matrix[i].length-1;
//             while(start<=end){
//                 int mid=start+(end-start/2);
//                 if(matrix[i][mid]==target){
//                     return true;
//                 }
//                 else if(matrix[i][mid]>target){
//                     end=mid-1;
//                 }
//                 else{
//                     start=mid+1;
//                 }
//             }
//         }
//         return false;
        
        // n^2
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[i].length; j++){
        //         if(matrix[i][j]==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}
