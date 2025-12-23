class Solution {
    public int passThePillow(int n, int time) {
        int a=time/(n-1);
        int b=time%(n-1);
        int c=0;
        if(a%2!=0){
            c=n-b;
        }
        else{
            c=b+1;
        }
        return c;
    }
}