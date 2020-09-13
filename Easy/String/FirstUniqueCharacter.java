class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for(int i = 0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            if(charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            }
            else {
                charMap.put(c, 1);
            }
        }
        
        for(int j = 0 ; j < s.length() ; j++) {
            char c = s.charAt(j);
            if(charMap.get(c) == 1) {
                return j;
            }
        }
        return -1;
    }
}