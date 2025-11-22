// Last updated: 22/11/2025, 8:29:52 pm
class Solution {
    public int totalWaviness(int num1, int num2) {
        if(num2<100) return 0;
        int total = 0;
        for( int i =num1;i<=num2;i++){
            if(i<100) continue;
            if(i<=999){
                String s = Integer.toString(i);
                char a = s.charAt(0), b = s.charAt(1), c = s.charAt(2);

                if((b>a && b>c)||(b<a && b<c)){
                    total++;
                }
            }else{
                total+=countwaves(i);
            }
        }

        return total;
    }

    private int countwaves(int num){
        int count = 0;
        String s= Integer.toString(num);
        for(int i  =1;i<s.length()-1;i++){
            char prev = s.charAt(i-1);
            char curr  =s.charAt(i);
            int next= s.charAt(i+1);

            if((curr>prev && curr>next)||(curr<prev && curr<next)) count++;
            
        }
        return count;
    }
}