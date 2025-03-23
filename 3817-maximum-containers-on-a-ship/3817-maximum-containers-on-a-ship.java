class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int capacity=n*n;
        int res=0;
        int cal=maxWeight/w;
        if(cal>capacity){
            res=capacity;
        }
        else{
            res=cal;
        }
        return res;
    }
}