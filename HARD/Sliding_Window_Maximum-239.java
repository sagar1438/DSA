class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] sol = new int[n-k+1];
        if(n == 0 || k==0){
            return sol;
        }
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0;i<k;i++){
            while(!dq.isEmpty()&& nums[i]>=nums[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
         
        int indx = 0;
        sol[indx++] = nums[dq.peekFirst()];
        for(int i = k;i<n;i++){
            while(!dq.isEmpty()&&dq.peekFirst()<=i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty()&& nums[i]>=nums[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
            sol[indx++] = nums[dq.peekFirst()];
        }
        return sol;
    }
}