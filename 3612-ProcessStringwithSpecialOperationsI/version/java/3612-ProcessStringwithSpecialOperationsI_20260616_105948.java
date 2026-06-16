// Last updated: 16/6/2026, 10:59:48 am
1class Solution {
2    public String processStr(String s) {
3        StringBuilder sb = new StringBuilder();
4
5        for(char ch: s.toCharArray()){
6            if(ch=='*'){
7                if(!sb.isEmpty())
8                    sb.deleteCharAt(sb.length() - 1);
9            }else if(ch=='#'){
10                sb.append(sb);
11            }else if(ch=='%'){
12                sb = sb.reverse();
13            }else{
14                sb.append(ch);
15            }
16        }
17
18        return sb.toString();
19
20    }
21}