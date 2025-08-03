// Last updated: 4/8/2025, 12:02:11 am
class Solution {
    public int minOperations(String[] logs) {
       
        int res = 0;

        for (String log : logs) {
            if (log.equals("../")) {
                if (res > 0) {
                    res--;
                }
            } else if (!log.equals("./")) {
                res++;
            }
        }

        return res;
    }
}