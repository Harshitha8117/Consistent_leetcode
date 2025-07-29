class Solution {
    public int[] shuffle(int[] nums, int n) {
        int N=n*2;
        int sol[]=new int[N];
        for(int i=0,j=0;i<N;i++){
            if(i%2==0){
                sol[i]=nums[j++];
            }
            else{
                sol[i]=nums[n++];
            }
        }
        return sol;
    }
}


