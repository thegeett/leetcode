Again we can relate this problem with Fibonacci series. Because we need to take which ever is minimum from i - 1 and i - 2 and that minimum we need to add to current value at ith element.

You can do it with recursive something like.

int lastMin = Math.min(minCost(n-1), minCost(n - 2));
int result = lastMin + cost[n]; // current value

you can optimise with memo and recursive. T= O(n) and S= O(n).

We can also do it with O(n) and O(1) space.

int a = cost[0];
int b = cost[1];

for(int i = 2; i < cost.length ;i++){
  int result = cost[i] + Math.min(a,b);
  a = b;
  b = result;
}

return Math.min(a, b);

Here basically we are getting min from last 2 sum and add it to current value. :)
