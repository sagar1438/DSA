class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        int pivot[] = intervals[0];

        for(int i = 1;i<intervals.length;i++){
            if(pivot[1]>=intervals[i][0]){
                pivot[1] = Math.max(pivot[1],intervals[i][1]);
            }else{
                list.add(pivot);
               pivot = intervals[i];
            }
        }
        list.add(pivot);
        return list.toArray(new int[0][]);
    }
}