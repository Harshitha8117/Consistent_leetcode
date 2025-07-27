class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while(n!=1){
            if(set.contains(n))
            return false;
            set.add(n);
            n=sq(n);
        }
        return true;
    }
        int sq(int n){
            int sum=0;
            while(n>0){
                int dig=n%10;
                sum+=dig*dig;
                n/=10;
            }
            return sum;
        }
    }