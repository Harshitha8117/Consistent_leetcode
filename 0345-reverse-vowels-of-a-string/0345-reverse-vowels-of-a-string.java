class Solution {
    public String reverseVowels(String s) {
        char a[]=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        String vowels="aeiouAEIOU";
        while(i<j){
            while(i<j && vowels.indexOf(a[i])==-1){
                i++;
            }
            while(i<j && vowels.indexOf(a[j])==-1){
                j--;
            }
            char temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        return new String(a);
    }
}