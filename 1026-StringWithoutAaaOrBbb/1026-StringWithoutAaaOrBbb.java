// Last updated: 4/8/2025, 12:03:15 am
class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder sb  = new StringBuilder();
        char f = 'a', s = 'b';

        if(b>a){
            f = 'b';
            s = 'a';
            int temp=a;
            a=b;
            b=temp;
        }
        boolean two =false;
        while(a>0 || b>0){
            if(Math.abs(b-a)>=3)two = true;
            else two=false;
            
            if(a-->0){
                sb.append(f);
            }
            if(a>0 && two){
                 sb.append(f);
                 a--;
            }
            if(b-->0){
                sb.append(s);
            }

        }
       
       
        return sb.toString();
    }
}