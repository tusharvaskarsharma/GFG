class Solution {
    
    static Integer steps = 0;
    
    void solve(int n, int from, int to, int aux){
        
        if (n==0) return;
        
        solve(n-1, from, aux, to);
        steps++;
        solve(n-1, aux, to, from);
        
    }
    
    public int towerOfHanoi(int n, int from, int to, int aux) {
        
        // code here
        steps = 0; 
        solve(n, from, to, aux);
        return steps;
        
    }
}
