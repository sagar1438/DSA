class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int Total = m + n;
        int num1 = 0;
        int num = 0; 
        double sol = 0;

        int i = 0;
        int n1 = 0;
        int n2 = 0;
        while (i <= Total / 2) {
            num1 = num;
            if (n1 < m && n2 < n) {
                if (nums1[n1] <= nums2[n2]) {
                    num = nums1[n1++];
                } else {
                    num = nums2[n2++];
                }
            } else if (n2 != n) {
                num = nums2[n2++]; 
            } else if (n1 != m) {
                num = nums1[n1++]; 
            }

            i++;
        }

        if (Total % 2 != 0) {
            sol = (double) num;
        } else {
            
            sol = (double) (num + num1) / 2;
            
        }

        return sol;

    }
}