class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> sol=new ArrayList<>();
        int top=0,bottom=matrix.length-1;
        int left=0,right=matrix[0].length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                sol.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                sol.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                sol.add(matrix[bottom][i]);
            }
            bottom--;
            }
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                sol.add(matrix[i][left]);
            }
            left++;
            }
        }
        return sol;
    }
}

