class Solution {
    public int maxFreqSum(String s) {
        String strv="";
        String strc="";
        int sol=0;
        for(char num:s.toCharArray()){
            if(num=='a'||num=='e'||num=='i'||num=='o'||num=='u'){
                strv+=num;
            }
            else{
                strc+=num;
            }
        }
        Map<Character,Integer> vow=new HashMap<>();
        for(char num:strc.toCharArray()){
            vow.put(num,vow.getOrDefault(num,0)+1);
        }
        Map<Character,Integer> cons=new HashMap<>();
        for(char num:strv.toCharArray()){
            cons.put(num,cons.getOrDefault(num,0)+1);
        }
        int cc=0;
        int vv=0;
        for(char num:vow.keySet()){
            int val=vow.get(num);
            if(val>vv){
                vv=val;
            }
        }
        sol+=vv;
        for(char num:cons.keySet()){
            int val=cons.get(num);
            if(val>cc){
                cc=val;
            }
        }
        sol+=cc;
        return sol;
    }
}