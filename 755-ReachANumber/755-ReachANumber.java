// Last updated: 4/8/2025, 12:04:11 am
class Solution 
{
    public int reachNumber(int target) 
    {
        target = Math.abs(target);
        int sum = 0, steps = 0;

        while (sum < target || (sum - target) % 2 != 0) 
        {
            steps++;
            sum += steps;
        }

        return steps;
    }
}