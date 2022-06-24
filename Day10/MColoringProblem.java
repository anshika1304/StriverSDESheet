// https://practice.geeksforgeeks.org/problems/m-coloring-problem-1587115620/1#

class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean graph[][], int m, int n) {
        List<Integer>[] list=new List[n];
        int[] color=new int[n];
        for(int i=0; i<graph.length; i++){
            list[i]=new ArrayList<>();
            for(int j=0; j<graph[i].length; j++){
                if(graph[i][j]){
                    list[i].add(j);
                }
            }
        }
        if(solve(0, list, color, m, n)==true){
            return true;
        }
        return false;
    }
    static boolean solve(int node, List<Integer>[] list, int[] color, int m, int n){
        if(node==n){
            return true;
        }
        for(int i=1; i<=m; i++){
            if(isValid(node, list, color, i, n)){
                color[node]=i;
                if(solve(node+1, list, color, m, n)==true){
                    return true;
                }
                color[node]=0;
            }
        }
        return false;
    }
    static boolean isValid(int node, List<Integer>[] list, int[] color, int col, int n){
        for(int it:list[node]){
            if(color[it]==col){
                return false;
            }
        }
        return true;
    }
}
