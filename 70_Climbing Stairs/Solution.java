
class Solution {
    // THIS IS KIND OF FIBONACI SERIES, CHECK OUT.
    
    /*public int climbStairs(int n) {
        
        if(n == 1){
            return 1;
        }
        if(n == 2 ){
            return 2;
        }
        
        return climbStairs(n - 1) + climbStairs(n - 2);
        
    }*/
    
    /*
    public int climbStairs(int n) {
        
        if(n == 1){
            return 1;
        }
        if(n == 2 ){
            return 2;
        }
        
        int a = 1;
        int b = 2;
        int result = 0;
        for(int i = 3; i<=n;i++){
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }
    */
    public int climbStairs(int n) {
        
        int[] memo = new int[n + 1];
        
        for(int i = 0;i <= n;i++){
            memo[i] = -1;
        }
        
        return cs(n, memo);
    }
   
    public int cs(int n, int[] memo) {
        
        if(memo[n] != -1){
            return memo[n];
        }
        
        if(n == 1){
            return 1;
        }
        if(n == 2 ){
            return 2;
        }
        
        int result = cs(n - 1, memo) + cs(n - 2, memo);
        memo[n] = result;
        return result;
    }
    
}
