class Solution {
    public String findValidPair(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        Set<Character> set=new HashSet<>();
        for(char freq:map.keySet()){
            int val=map.get(freq);
            if(val==freq-'0'){
                set.add(freq);
            }
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                continue;
            }
            if(set.contains(s.charAt(i)) && set.contains(s.charAt(i+1))){
                return ""+s.charAt(i) + s.charAt(i+1);
            }
        }
        return "";
    }
}