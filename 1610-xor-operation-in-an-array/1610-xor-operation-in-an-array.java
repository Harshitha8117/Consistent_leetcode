
class Solution {
    public int xorOperation(int n, int start) {
        int a=0;
        for(int i=0;i<n;i++){
            a=start^a;
            start=start+2;
        }
        return a;
    }
}