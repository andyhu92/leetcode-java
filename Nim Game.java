/*
1,2,3 win, 4 lose.
5,6,7 win, 8 lose.
so we can figure out...
*/
public class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}