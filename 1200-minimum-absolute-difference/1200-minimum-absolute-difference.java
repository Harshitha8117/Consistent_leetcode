class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            min=Math.min(min,arr[i+1]-arr[i]);
        }
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            if(min==arr[i+1]-arr[i]){
                res.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return res;
    }
}


