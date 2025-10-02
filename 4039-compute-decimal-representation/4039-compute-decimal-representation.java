class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> arr=new ArrayList<>();
        int i=1;
        while(n>0){
            int power=1;
            int dig=n%10;
            power=dig*i;
            if(power!=0)
            arr.add(power);
            i*=10;
            n/=10;
        }
        int a[]=new int[arr.size()];
        int k=0;
        for(int j=a.length-1;j>=0;j--){
            a[k++]=arr.get(j);
        }
        return a;
    }
}