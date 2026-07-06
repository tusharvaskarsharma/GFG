class Solution {
    int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        // Code here
        for (int i : arr){
            curSum += i;
            if (curSum > maxSum) maxSum = curSum;
            if (curSum < 0) curSum = 0;
            
        }
        return maxSum;
    }
}
