class Solution {
    public int numberOfWays(String s) {
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='S'){
                li.add(i);
            }
        }
        if(li.size()%2!=0 || li.size()==0)
        return 0;
        int modulo=1000000007;
        long w=1;
        for(int i=2;i<li.size();i+=2){
            int l=li.get(i-1);
            int r=li.get(i);
            int plant=r-l-1;
            w=(w*(plant+1))%modulo;
        }
        return (int)w;
    }
}






