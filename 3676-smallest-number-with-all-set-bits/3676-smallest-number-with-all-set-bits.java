class Solution {
    public int smallestNumber(int n) {
        String res=Integer.toBinaryString(n);
        char a[]=res.toCharArray();
        int s=a.length;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s;i++){
            sb.append('1');
        }
        int num=Integer.parseInt(sb.toString(),2);
        return num;
    }
}