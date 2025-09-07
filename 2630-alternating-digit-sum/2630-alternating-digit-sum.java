class Solution {
    public int alternateDigitSum(int n) {
        List<Integer> li=new ArrayList<>();
        while(n>0){
            li.add(n%10);
            n/=10;
        }
        Collections.reverse(li);
        int a[]=new int[li.size()];
        for(int i=0;i<li.size();i++){
            a[i]=li.get(i);
        }
        int sum=0;
        for(int i=0;i<li.size();i++){
            if(i%2==0){
                sum+=a[i];
            }
            else{
                sum-=a[i];
            }
        }
        return sum;
    }
}