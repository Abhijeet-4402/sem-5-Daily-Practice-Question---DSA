// Last updated: 4/8/2025, 12:09:22 am
class Solution {
    public int reverse(int x) {
        long rev = 0;
        while(x!=0){
            rev=rev*10+x%10;
            x/=10;
        }
        return (rev<Math.pow(-2,31)||rev>=Math.pow(2,31))? 0 : (int)rev;
    }
}