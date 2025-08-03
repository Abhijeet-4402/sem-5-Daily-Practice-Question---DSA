// Last updated: 4/8/2025, 12:04:23 am
class Solution {
    public int calPoints(String[] operations) {
        int index=0;
        int [] arr=new int[operations.length];
        for(String i:operations){
            if(i.equals("+")){
                arr[index]=arr[index-1]+arr[index-2];
                index++;
            }
            else if(i.equals("C")){
                --index;
            }
            else if(i.equals("D")){
                arr[index]=2 * arr[index-1];
                index++;
            }
            else{
                arr[index]=Integer.parseInt(i);
                index++;
            }
        }
        int ans=0;
        while(--index!=-1){
            ans+=arr[index];
        }
        return ans;
    }
}
