class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,pro=1;
        int temp=n;
        while(n!=0){
            int dig=n%10;
            sum+=dig;
            pro*=dig;
            n/=10;
        }
        int ans=sum+pro;
        if((temp%ans)==0)
        return true;
        return false;
    }
}

/*class Solution {
    public boolean checkDivisibility(int n) {
        int x=n;
        int sum=0,pro=1;
       while(n!=0){
           int dig=n%10;
           sum+=dig;
           pro*=dig;
           n/=10;
       } 
        if(x%(sum+pro)==0){
            return true;
        }
       return false;
    }
}*/