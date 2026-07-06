class Solution {
    public int maxIncSubarraySum(int arr[]) {
        // code here
        int msum = arr[0];
        int csum = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i] > arr[i-1]) csum += arr[i];
            else csum = arr[i];
            msum = Math.max(msum, csum);
        }
        return msum;
    }
}