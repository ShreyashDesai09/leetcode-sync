// LeetCode: 205. Isomorphic Strings
class _205_isomorphic_strings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            
            
            for (int j = i + 1; j < s.length(); j++) {
            
                if (s.charAt(j) == a && t.charAt(j) != b) {
                    return false;
                }
            
                if (s.charAt(j) != a && t.charAt(j) == b) {
                    return false;
                }
            }
        }
        return true;
    }
}
