class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int b[]=arr.clone();
        Arrays.sort(b);
        int rank=1;
        Map<Integer,Integer> map=new HashMap<>();
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