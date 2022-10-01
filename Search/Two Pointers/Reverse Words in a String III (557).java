public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == ' ' || i == s.length()-1){
                sb.append(reverseString(s.substring(start,i+1))).append(" ");
                start = i;
            }
        }
        return sb.toString().trim();
    }
    
    private String reverseString(String s){
        StringBuilder sn = new StringBuilder();
        for(int i =0;i<s.length();i++){
            sn.append(s.charAt(s.length()-i-1));
        }
        return sn.toString().trim();
    }