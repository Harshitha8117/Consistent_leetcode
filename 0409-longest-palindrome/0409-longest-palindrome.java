class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> ch=new HashMap<>();
        int odd=0;

        for(char c:s.toCharArray()){
            ch.put(c,ch.getOrDefault(c,0)+1);

            if(ch.get(c)%2==1)
                odd++;
            else
                odd--;
        }
        if(odd>1)
            return s.length()-odd+1;
        return s.length();
    }
}