class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        if(s == null) return res;
        if(s.length() == 0) { res.add(""); return res; }

        Set<String> validSet = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.offer(s);
        validSet.add(s);

        boolean seen = false;
        while(!q.isEmpty()) {
            String curr = q.poll();
            if(isValid(curr)) {
                res.add(curr);
                seen = true;
            }
            if(seen) continue; 
            for(int i = 0; i <curr.length(); i++) {
                char ch = curr.charAt(i);
                if(ch != '(' && ch != ')') continue; 
                String neighbour = curr.substring(0, i) + curr.substring(i + 1);
                if(!validSet.contains(neighbour)) {
                    q.offer(neighbour);
                    validSet.add(neighbour);
                }
            }
        }

        return res;
    }

    private boolean isValid(String expr) { 
        int open = 0;
        for(char ch: expr.toCharArray()) {
            if(ch != '(' && ch != ')') continue;
            if(ch == '(') open++;
            else if(ch == ')') open--;
            if(open < 0) return false;
        }
        return (open == 0);
    }
}