
class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int balance = 0, lastInvalid = -1, maxLen = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') balance++;
            else balance--;

            if (balance < 0) {
                balance = 0;
                lastInvalid = i;
            } else if (balance == 0) {
                maxLen = Math.max(maxLen, i - lastInvalid);
            }
        }

        balance = 0;
        lastInvalid = n;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == ')') balance++;
            else balance--;

            if (balance < 0) {
                balance = 0;
                lastInvalid = i;
            } else if (balance == 0) {
                maxLen = Math.max(maxLen, lastInvalid - i);
            }
        }

        return maxLen;
    }
}
=======
class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int balance = 0, lastInvalid = -1, maxLen = 0;

        // Left to right
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') balance++;
            else balance--;

            if (balance < 0) {
                balance = 0;
                lastInvalid = i;
            } else if (balance == 0) {
                maxLen = Math.max(maxLen, i - lastInvalid);
            }
        }

        // Right to left
        balance = 0;
        lastInvalid = n;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == ')') balance++;
            else balance--;

            if (balance < 0) {
                balance = 0;
                lastInvalid = i;
            } else if (balance == 0) {
                maxLen = Math.max(maxLen, lastInvalid - i);
            }
        }

        return maxLen;
    }
}

