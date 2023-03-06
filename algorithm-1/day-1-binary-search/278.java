/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n, middle;
        while (left < right) {
            middle = (right - left) / 2 + left;

            if (isBadVersion(middle)) {
                right = middle;
                continue;
            }

            left = middle + 1;
        }

        return left;
    }
}
