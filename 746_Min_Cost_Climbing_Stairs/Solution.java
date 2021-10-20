class Solution {
    public int minCostClimbingStairs1(int[] cost) {
        
        int n = cost.length;

        int[] memo = new int[n + 1];
        
        for( int i =0 ;i<=n;i++){
            memo[i] = -1;
        }
        
        if(n == 3){
            return Math.min(cost[0]+cost[2], cost[1]);   
        }
        
        //int result = minCost( n -1, cost);
        //return result - (n % 2 == 0 ? cost[n -1] : 0);
        return minCost( n, cost, memo);
    }
    
    public int minCost(int n, int[] cost, int[] memo){
        
        if(memo[n] != -1){
            return memo[n];
        }
        
        if(n < 2){
            return cost[n];
        }
        
        int lastMin = Math.min(minCost(n - 1, cost,memo), minCost(n - 2, cost,memo));
        
        int result = lastMin + (n < cost.length ? cost[n] : 0) ;
        memo[n] = result;
        return result;
        
    }
    
     public int minCostClimbingStairs(int[] cost) {
         
         if(cost.length == 1){
             return cost[0];
         }
         
         if(cost.length == 2){
             return Math.min(cost[0], cost[1]);
         }
         
         int a = cost[0];
         int b = cost[1];
         
         // here we just take min of last two calculater value and add to current value. debug it.
         
         for(int i = 2; i< cost.length; i++){
             int result = cost[i] + Math.min(a, b);
             
             //intially I put b = a; a = result, but for 3 size cost it did not work [10,15,20], so changed to below. 
             
             a = b;
             b = result;
         }
         
         return Math.min(a,b);
     }
    
}
