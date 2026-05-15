class Solution {
    public int lengthOfLastWord(String s) {
        int endIndex = -1;
        int startIndex = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (endIndex == -1 && Character.isLetter(s.charAt(i))) {
                endIndex = i;
            }
            if (endIndex > -1 && s.charAt(i) == ' ') {
                startIndex = i;
                return endIndex - startIndex;
            }
        }
        return endIndex - startIndex;
    }
}