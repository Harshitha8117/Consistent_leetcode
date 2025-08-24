class Solution {
    public String decodeString(String s) {
        Stack<Integer> dig=new Stack<>();
        Stack<StringBuilder> ch=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int k=0;
        for(char num:s.toCharArray()){
            if(Character.isDigit(num)){
                k=k*10+(num-'0');
            }
            else if(num=='['){
                dig.push(k);
                ch.push(sb);
                sb=new StringBuilder();
                k=0;
            }
            else if(num==']'){
                StringBuilder str=new StringBuilder();
                str=ch.pop();
                int n=dig.pop();
                for(int i=0;i<n;i++){
                    str.append(sb);
                }
                sb=str;
            }
            else{
                sb.append(num);
            }
        }
        return sb.toString();
    }
}

