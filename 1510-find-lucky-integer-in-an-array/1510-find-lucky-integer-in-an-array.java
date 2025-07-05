class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> iter = new HashMap<>();

        for(int n:arr){
            iter.put(n,iter.getOrDefault(n,0)+1);
        }

        int lucky=-1;

        for(int j:iter.keySet()){
            if(iter.get(j)==j){
                lucky=j;
            }
        }
        return lucky;
    }
}


