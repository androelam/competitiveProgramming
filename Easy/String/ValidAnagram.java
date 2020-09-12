class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> stringOne = new HashMap<>();
        Map<Character, Integer> stringTwo = new HashMap<>();
        
        for(int i = 0 ; i < s.length() ; i ++ ){
            char a = s.charAt(i);
            if(stringOne.containsKey(a)) {
                stringOne.put(a, stringOne.get(a) + 1);
            }
            else {
                stringOne.put(a,1);
            }
        }
        
        for(int j= 0 ; j < t.length() ; j ++) {
            char b = t.charAt(j);
            if(stringTwo.containsKey(b)) {
                stringTwo.put(b, stringTwo.get(b) + 1);
            }
            else{
                stringTwo.put(b,1);
            }
        }
        
        return stringOne.equals(stringTwo);
    }
}