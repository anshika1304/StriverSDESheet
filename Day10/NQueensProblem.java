// https://leetcode.com/problems/n-queens/

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] chess=new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                chess[i][j]='.';
            }
        }
        placeQueen(ans, chess, 0);
        return ans;
    }
    private void placeQueen(List<List<String>> ans, char[][] chess, int row){
        if(row==chess.length){
            ans.add(build(chess));
            return;
        }
        for(int col=0; col<chess.length; col++){
            if(valid(chess, row, col)){
                chess[row][col]='Q';
                placeQueen(ans, chess, row+1);
                chess[row][col]='.';
            }
        }
    }
    private boolean valid(char[][] chess, int row, int col){
        for(int i=0; i<row; i++){
            if(chess[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1; i>=0&&j<chess.length; i--,j++){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1; i>=0&&j>=0; i--,j--){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    private List<String> build(char[][] chess){
        List<String> list=new ArrayList<>();
        for(int i=0; i<chess.length; i++){
            list.add(new String(chess[i]));
        }
        return list;
    }
}
