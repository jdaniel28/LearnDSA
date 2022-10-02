   public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i< s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                ++left;
            }
            set.add(s.charAt(i));
            if(set.size()>max){
                max = set.size();
            }
        }
        return max;
    }