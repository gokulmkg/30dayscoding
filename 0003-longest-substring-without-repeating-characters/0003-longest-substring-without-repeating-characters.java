class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> setchar = new HashSet<>();
        int maxlength = 0;
        int left = 0;
        for(int right = 0;right < s.length();right++) {
              
              while(setchar.contains(s.charAt(right))){
                setchar.remove(s.charAt(left));
                left++;
              }

            setchar.add(s.charAt(right));
            maxlength = Math.max(maxlength,right-left+1);

        }
        return maxlength;
    }
}