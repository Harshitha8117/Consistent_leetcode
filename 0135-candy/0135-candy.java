class Solution {
    public int candy(int[] r) {
        int [] arr=new int[r.length];
        for(int i=0;i<r.length-1;i++){
            if(r[i]>r[i+1]){
                arr[i]=2;
                arr[i+1]=1;
            }
            else if(r[i]<r[i+1]){
                arr[i]=2;
                arr[i+1]=1;
            }
            else{
                if(arr[i]==0){
                    
                }
            }
        }
    }
}