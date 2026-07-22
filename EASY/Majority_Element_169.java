class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sol = 0;
        int curr = 0;
        for(int i = 0 ; i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
           
        }
        for(Map.Entry<Integer,Integer> map2 : map.entrySet()){
            if(curr<map2.getValue()) {
                curr = map2.getValue();
                sol = map2.getKey();
            }
        }
        
        return sol;
    }
}