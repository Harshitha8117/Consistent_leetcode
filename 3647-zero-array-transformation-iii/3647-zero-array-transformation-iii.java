class Solution {
    public int maxRemoval(int[] arr, int[][] queries) {

        Arrays.sort(queries,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);

        int preSum = 0;
        int n = arr.length;
        int m = queries.length;
        int freq[] = new int[n+1];
        int j = 0;
        for(int i=0; i<n; i++){
            preSum+=freq[i];
            while(j<m && queries[j][0]==i){
                pq.add(queries[j][1]);
                j++;
            }

            while(preSum<arr[i] && pq.size()!=0 && pq.peek()>=i){
                preSum++;
                freq[pq.remove()+1]--;
            }

            if(preSum<arr[i]) return -1;
        }
        return pq.size();
    }
}