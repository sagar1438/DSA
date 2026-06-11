class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> visited = new HashSet<>();
        Set<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord))return 0;
            
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        q.add(beginWord);
        int sol = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String curr = q.poll();
                if (curr.equals(endWord))return sol;
                    
                for (int j = 0; j < curr.length(); j++) {
                    for (int k = 'a'; k <='z'; k++) {
                        char ch[] = curr.toCharArray();
                        ch[j] = (char) k;
                        String newstr = new String(ch);
                        if (set.contains(newstr) && !visited.contains(newstr)) {
                            visited.add(newstr);
                            q.add(newstr);
                        }
                    }
                }
            }
            ++sol;
        }
        return 0;
    }
}