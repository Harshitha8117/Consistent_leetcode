class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        int rank=1;
        int[] b=arr.clone();
        Arrays.sort(b);
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(b[i])){
                map.put(b[i],rank++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}