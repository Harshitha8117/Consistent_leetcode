class Solution {
    public String convertToTitle(int col) {
       /*if(col==0)
        return "";
        col--;
        char c=(char) ('A'+col%26);
        return convertToTitle(col/26)+c;*/
        StringBuilder sb=new StringBuilder();
        while(col>0){
          col--;
          char c=(char) ('A'+ col%26);
          sb.insert(0,c);
          col/=26;
        }
        return sb.toString();
    }
}




