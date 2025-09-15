class Solution {
    public boolean equalFrequency(String word) {
        for(int i=0;i<word.length();i++){
            Map<Character,Integer> map=new HashMap<>();
            for(int j=0;j<word.length();j++){
                if(i==j)
                continue;
                    char c=word.charAt(j);
                    map.put(c,map.getOrDefault(c,0)+1);
            }
            Set<Integer> set=new HashSet<>(map.values());
            if(set.size()==1)
            return true;
        }
        return false;
    }
}