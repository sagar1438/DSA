class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if (i == s.length())
            return 0;

        int sign = 1;
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        long sol = 0;

        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';
            sol = sol * 10 + digit;
            if (sign*sol >= max)
                return max;
            if (sign* sol <= min)
                return min;

            i++;
        }
        return (int)(sol*sign);

    }
}
