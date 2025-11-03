class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            char y = t.charAt(i);
            if (mapST.containsKey(x)) {
                if (mapST.get(x) != y) return false;
            } else {
                mapST.put(x, y);
            }
            if (mapTS.containsKey(y)) {
                if (mapTS.get(y) != x) return false;
            } else {
                mapTS.put(y, x);
            }
        }

        return true;
    }
}
