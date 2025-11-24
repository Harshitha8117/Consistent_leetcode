class Solution {
    public int maxDepth(String s) {
        int max=0;
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='(')
            c++;
            max=Math.max(c,max);
            if(ch==')')
            c--;
        }
        return max;
    }
}