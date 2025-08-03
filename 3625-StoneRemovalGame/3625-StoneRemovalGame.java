// Last updated: 4/8/2025, 12:00:57 am
class Solution {
    public boolean canAliceWin(int n) {
        if(n<10)
            return false;
        if(n<19)
            return true;
        for(int i = 10; i>0; i--){
            if(i%2==0){
                if(i>n)
                    return false;
                else
                    n-=i;
            }else{
                if(i>n)
                    return true;
                else
                    n-=i;
            }
        }
        return true;
    }
}