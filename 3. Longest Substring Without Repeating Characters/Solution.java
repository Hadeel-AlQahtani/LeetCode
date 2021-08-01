class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        String longestSub = "";

        for (int i = 0; i < s.length(); i++) {
            String correntSub = "";
            for (int j = i; j < s.length(); j++) {
                if (correntSub.contains(String.valueOf(s.charAt(j)))) {
                    break;
                }
                correntSub += s.charAt(j);
            }
            if (correntSub.length() > longestSub.length()) {
                longestSub = correntSub;
            }
        }

        System.out.println(longestSub);
        return longestSub.length();
    }
}
