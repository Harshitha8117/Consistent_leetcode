class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> luc = new HashMap<>();

        for(int i:arr){
            luc.put(i,luc.getOrDefault(i,0)+1);
        } 

        int luck=-1;

        for(int j:luc.keySet()){
            if(luc.get(j)==j){
                luck=j;
            }
        }
        return luck;
    }
}


