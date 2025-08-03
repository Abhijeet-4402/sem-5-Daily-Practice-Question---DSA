// Last updated: 4/8/2025, 12:04:17 am
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack= new Stack<>();
        for(int asteroid:asteroids){
            if(asteroid>0){
                stack.push(asteroid);
                continue;
            }
            while(!stack.isEmpty() && stack.peek()>0 && Math.abs(asteroid)>stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty() || stack.peek()<0){
                stack.push(asteroid);
            }
            else if(stack.peek()==Math.abs(asteroid)){
                stack.pop();
            }

        }
        int[] ans=new int[stack.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=stack.pop();
        }
        return ans;
    }
}