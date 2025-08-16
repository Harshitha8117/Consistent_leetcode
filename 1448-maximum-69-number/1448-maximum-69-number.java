class Solution {
    public int maximum69Number(int num) {
        int temp=num;
        int i=1;
        int rev=0;

        while(num>0){
            int dig=num%10;
            rev=rev*10+dig;
            i*=10;
            num/=10;
        }

        while(rev%10==9){
            rev/=10;
            i/=10;
        }
        return temp+3*(i/10);
    }
}




/*class Solution {
    public int maximum69Number (int num) {
        String str=Integer.toString(num);
        char dig[]=str.toCharArray();
        for(int i=0;i<dig.length;i++){
            if(dig[i]=='6'){
                dig[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(dig));
    }
}*/
