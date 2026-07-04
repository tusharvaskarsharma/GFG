class Solution {
    public int countFriendsPairings(int n) {
        // code here
        if (n==1 || n==2) return n;
        
        int f1 = countFriendsPairings(n-1);
        int f2 = (n-1)* countFriendsPairings(n-2);
        
        return f1+f2;
    }
}
