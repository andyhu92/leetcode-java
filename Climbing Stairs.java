/*
Set function f(n) represents distinct ways to climb n steps
we can climb 1 or 2 steps each time.
So f(n) = f(n-1) + f(n-2) // fibonacci 
and we know f(1) = 1, f(2) = 2,
so we can figure out f(n)...
*/
public class Solution {
    public int climbStairs(int n) {
        if(n<3) return n;
        int step[] = new int[n];
        step[0] = 1; step[1] = 2;
        for(int i=2;i<n;i++){
            step[i] = step[i-1]+step[i-2];
        }
        return step[n-1];
    }
}