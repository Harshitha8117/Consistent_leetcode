class Solution {
    public String decodeString(String s) {
        Stack<Integer> dig=new Stack<>();
        Stack <StringBuilder> ch=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int k=0;
        for(char chi:s.toCharArray()){
            if(Character.isDigit(chi)){
                k=k*10+(chi-'0');
            }
            else if(chi=='['){
                dig.push(k);
                ch.push(sb);
                sb=new StringBuilder();
                k=0;
            }
            else if(chi==']'){
                StringBuilder dec=new StringBuilder();
                dec=ch.pop();
                int po=dig.pop();
                for(int i=0;i<po;i++){
                    dec.append(sb);
                }
                sb=dec;
            }
            else{
                sb.append(chi);
            }
        }
        return sb.toString();
    }
}

