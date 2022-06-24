// https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1

class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans=new ArrayList<>();
        int[][] vis=new int[n][n];
        for(int i=0; i<vis.length; i++){
            Arrays.fill(vis[i], 0);
        }
        if(m[0][0]==1){
            solve(0, 0, m, n, ans, "", vis);
        }
        return ans;
    }
    static void solve(int i, int j, int[][] m, int n, ArrayList<String> ans, String move, int[][] vis){
        if(i==n-1 && j==n-1){
            ans.add(move);
            return;
        }
        // upward
        if(i-1>=0 && vis[i-1][j]==0 && m[i-1][j]==1){
            vis[i][j]=1;
            solve(i-1, j, m, n, ans, move+'U', vis);
            vis[i][j]=0;
        }
        // downward
        if(i+1<n && vis[i+1][j]==0 && m[i+1][j]==1){
            vis[i][j]=1;
            solve(i+1, j, m, n, ans, move+'D', vis);
            vis[i][j]=0;
        }
        // leftward
        if(j-1>=0 && vis[i][j-1]==0 && m[i][j-1]==1){
            vis[i][j]=1;
            solve(i, j-1, m, n, ans, move+'L', vis);
            vis[i][j]=0;
        }
        // rightward
        if(j+1<n && vis[i][j+1]==0 && m[i][j+1]==1){
            vis[i][j]=1;
            solve(i, j+1, m, n, ans, move+'R', vis);
            vis[i][j]=0;
        }
    }
}
