class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        List<Character> li=new ArrayList<>();
        int c=0;
        for(char num:jewels.toCharArray()){
            li.add(num);
        }
        for(int i=0;i<stones.length();i++){
            if(li.contains(stones.charAt(i))){
                c++;
            }
        }
        return c;
    }
}