class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> str=new HashMap<>();
        String op="";
        for(String st:arr){
            str.put(st,str.getOrDefault(st,0)+1);
        }
        int c=0;
        for(String st:arr){
            if(str.get(st)==1){
                c++;
                if(c==k)
                op=st;
            }
        }
        return op;
    }
}