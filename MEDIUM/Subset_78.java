class Solution { 
    public List<List<Integer>> subsets(int[] nums) { 
        List<List<Integer>> sol = new ArrayList<>(); 
        List<Integer> curr = new ArrayList<>(); 
        findsub(nums,sol,curr,0); 
        return sol; 
    } 
 
    public static void findsub(int[] nums, List<List<Integer>> sol, List<Integer> curr, int indx){ 
 
        // if(indx== nums.length){  
        // sol.add(new ArrayList<>(curr)); 
        // return;} 
 
        sol.add(new ArrayList<>(curr)); 
        for(int i = indx; i<nums.length; i++){ 
 
 
            curr.add(nums[i]); 
            findsub(nums,sol,curr,i+1); 
            curr.remove(curr.size()-1); 
 
        } 
    } 
}