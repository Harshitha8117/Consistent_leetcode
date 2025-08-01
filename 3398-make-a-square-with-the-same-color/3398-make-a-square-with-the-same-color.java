class Solution {
    public boolean canMakeSquare(char[][] grid) {
        int n=grid.length-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int c=1;
                if(grid[i][j]==grid[i+1][j])
                c++;
                if(grid[i][j]==grid[i][j+1])
                c++;
                if(grid[i][j]==grid[i+1][j+1])
                c++;
                if(c==1||c==3||c==4)
                return true;
            }
        }
        return false;
    }
}