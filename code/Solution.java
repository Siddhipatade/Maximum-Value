class Solution {
    public static int maxValue(int n, int index, int maxSum) {
        long lt = index;
        long rt = n - index - 1;
        long st = 1;
        long end = maxSum;

        while (st <= end) {
            long mid = st + (end - st) / 2;
            long m = mid - 1;
            long ls = 0;
            long rs = 0;

            if (m >= lt) {
                long notInRange = m - lt;
                ls = m * (m + 1) / 2 - (notInRange) * (notInRange + 1) / 2;
            } else {
                ls = m * (m + 1) / 2 + 1 * (lt - m);
            }

            if (m >= rt) {
                long notInRange = m - rt;
                rs = m * (m + 1) / 2 - (notInRange) * (notInRange + 1) / 2;
            } else {
                rs = m * (m + 1) / 2 + 1 * (rt - m);
            }

            long sum = rs + ls + mid;

            if (sum > maxSum) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return (int) end;
    }

    public static void main(String[] args) {
        int n = 5;
        int index = 2;
        int maxSum = 18;

        int result = maxValue(n, index, maxSum);
        System.out.println("Maximum value at index " + index + ": " + result);
    }
}
