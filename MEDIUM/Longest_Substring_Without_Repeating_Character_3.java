class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashSet<Character> set = new HashSet<>();
     int sol=0;
     int curr=0;
     for(int i = 0; i<s.length();i++){
        if(set.contains(s.charAt(i))){
            while(set.contains(s.charAt(i))){
            set.remove(s.charAt(curr));
            curr++;
            }
            set.add(s.charAt(i));
        }else{
            set.add(s.charAt(i));
             sol = Math.max(sol,i-curr+1);

            }
     }
     return sol;
    }
}