class Solution {
    public String largestGoodInteger(String num) {
        String ans="";
        for(int i=0;i<num.length()-2;i++){
            char a=num.charAt(i);
            char b=num.charAt(i+1);
            char c=num.charAt(i+2);
            if(a==b&&b==c&&c==a){
                if(ans.isEmpty() || a>ans.charAt(0))
                ans=""+a+a+a;
            }
        }
        return ans;
    }
}




