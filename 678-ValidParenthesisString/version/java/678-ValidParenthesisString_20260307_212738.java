// Last updated: 7/3/2026, 9:27:38 pm
1class Solution {
2    public boolean checkValidString(String s) {
3        int min = 0, max = 0;
4        for(char ch: s.toCharArray()){
5            if(ch=='('){
6                min++;
7                max++;
8            }else if (ch==')'){
9                min--;
10                max--;
11            }else{
12                min--;
13                max++;
14            }
15            if(max<0) return false;
16            min = Math.max(min, 0);
17        }
18        return min==0;
19    }
20}