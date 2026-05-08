class Solution {
    public int maxArea(int[] height) {
        
        int L = 0;
        int R = height.length-1;
        int sol = 0;

        while(L<R){
            int Length = R-L;
            int Breadth = Math.min(height[R],height[L]);

            sol = Math.max(sol,Length*Breadth);

            if(height[L]<=height[R]){
                L++;
            }else{
                R--;;
            }
        }
        return sol;
    }
}