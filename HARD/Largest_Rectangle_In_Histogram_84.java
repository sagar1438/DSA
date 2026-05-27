class Solution {
    public int largestRectangleArea(int[] heights) {

        int left[] = new int[heights.length];
        int right[] = new int[heights.length];
        Stack<Integer> s = new Stack<>();
        int ans = 0;

        for(int i = 0;i<heights.length;i++){
            while(!s.isEmpty()&&heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                left[i] = s.peek();
            }else{
                left[i] = -1;
            }
            s.push(i);
        }
        s.clear();
        for(int i = heights.length-1;i>=0;i--){
            while(!s.isEmpty()&&heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                right[i] = s.peek();
            }else{
                right[i] = heights.length;
            }
             s.push(i);
        }

        for(int i = 0 ;i<heights.length;i++){
            int L = left[i];
            int R = right[i];
            int area = (R - L - 1)*heights[i];
            ans = Math.max(area,ans);
        }
        return ans;
    }
}