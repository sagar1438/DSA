class Solution {
    public boolean isHappy(int n) {
        if(n == 1) return true;

        Set<Integer> map = new HashSet<>();
        // map.add(n);

        int currsum = 0;
        int currnum = n;
        while(true){
            String strnum = Integer.toString(currnum);
            char charr[] = strnum.toCharArray();
            for(char ch : charr){
                int num = ch - '0';
                currsum = currsum + (num * num);
            }    
            if(currsum == 1) return true;
            if(map.contains(currsum)) return false;
            map.add(currsum);
            currnum = currsum;
            currsum = 0;
        }

    }
}