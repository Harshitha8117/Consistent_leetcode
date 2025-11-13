class Solution {
    public int maxOperations(String s) {
        int i=s.length()-1,c=0,res=0;;
        while(i>=0){
            while(s.charAt(i)=='1'){
                i--;
                res+=c;
                if(i<0)
                return res;
            }
            while(s.charAt(i)=='0'){
                i--;
                if(i<0)
                return res;
            }
            c++;
        }
        return res;
    }
}