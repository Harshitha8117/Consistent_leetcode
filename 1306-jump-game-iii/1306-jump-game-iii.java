class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean visit[] = new boolean[arr.length];
        return dfs(arr,start,visit);
    }
    boolean dfs(int arr[],int i,boolean visit[]){
        if(i<0 || i>=arr.length || visit[i
        ])
        return false;
        if(arr[i]==0)
        return true;
        visit[i]=true;
        return dfs(arr,i+arr[i],visit) || dfs(arr,i-arr[i],visit);
    }
}