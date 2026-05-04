class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);

        String F = strs[0];
        String L = strs[strs.length-1];

        int i = 0;
        int len = Math.min(F.length(),L.length());
        while(i<len){
            if(F.charAt(i)!=L.charAt(i)){
                return sb.toString();
            }
            sb.append(F.charAt(i));
            i++;
        }
        return sb.toString();
    }
}
