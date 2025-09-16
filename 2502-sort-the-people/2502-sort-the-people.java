class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(heights[i]>heights[j]){
                    String temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;

                    int temps=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temps;
                }
            }
        }
        return names;
    }
}