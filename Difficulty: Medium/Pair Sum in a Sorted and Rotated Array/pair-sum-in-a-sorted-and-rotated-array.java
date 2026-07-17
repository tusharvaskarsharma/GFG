
class Solution {
    static int breakingPoint(int arr[]){
        for (int i=0; i<arr.length-1; i++){
            if (arr[i]>arr[i+1]) return i;
        }
        return arr.length-1;
    }
    static boolean pairInSortedRotated(int arr[], int target) {
        // Your code here
        int n = arr.length; 
        int lp, rp;
        rp = breakingPoint(arr);
        lp = (rp+1)%n;
        while (lp != rp){
             if ((arr[lp]+arr[rp]) == target) return true;
             
             if((arr[lp]+arr[rp]) < target) lp = (lp+1)%n;
             else rp = (n+rp-1)%n;
        }
        return false;
    }
}
