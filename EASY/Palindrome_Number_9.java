class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int q = 0, o = x;
        while (x > 0) {
            q = (x % 10) + q * 10;
            x = x / 10;
        }
        return q == o;
    }
}