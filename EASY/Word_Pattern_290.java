class Solution {
    public boolean wordPattern(String pattern, String s) {
        char arrp[] = pattern.toCharArray();
        String arrs[] = s.split(" ");

        if(arrp.length != arrs.length) return false;

        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> rev = new HashMap<>();



        for(int i= 0; i<arrp.length; i++){

            if(map.containsKey(arrp[i])){
                if(!(map.get(arrp[i]).equals(arrs[i]))) return false;
            }else if(rev.containsKey(arrs[i])){
                return false;
            }
            else{
                map.put(arrp[i],arrs[i]);
                rev.put(arrs[i],arrp[i]);
            }
        }
        return true;
    }
}