class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> sol = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        combination(candidates, target, sol, curr, 0);
        return sol;
    }

    public void combination(int[] candidates, int target, List<List<Integer>> sol, List<Integer> curr, int indx) {

        if ( target < 0) {
            return;
        }
        if (target == 0) {
            sol.add(new ArrayList<>(curr));
            return;
        }

        for (int i = indx; i < candidates.length; i++) {
            curr.add(candidates[i]);
            combination(candidates, target - candidates[i], sol, curr, i);
            curr.remove(curr.size() -1 );
            // combination(candidates, target, sol, curr, i);
            // curr.add(candidates[i]);
            // combination(candidates, target - candidates[i], sol, curr, i+1);
        }

    }
}