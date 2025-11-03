class Solution {
    public String reverseOnlyLetters(String s) {
        char a[]=s.toCharArray();
        int start=0,end=a.length-1;
        while(start<end){
            if(Character.isLetter(a[start]) && Character.isLetter(a[end])){
                char temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }
            else if(!Character.isLetter(a[start])){
                start++;
            }
            else{
                end--;
            }
        }
        return new String(a);
    }
}