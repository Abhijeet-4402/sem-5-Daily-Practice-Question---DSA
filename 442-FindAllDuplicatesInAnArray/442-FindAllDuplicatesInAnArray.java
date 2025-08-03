// Last updated: 4/8/2025, 12:05:25 am
class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> ll = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)continue;
            if(arr[i]-1!=i ){
                if(arr[i]==arr[arr[i]-1]){
                    ll.add(arr[i]);
                    arr[i]=0;
                   
                }else{
                    int temp = arr[i];
                    arr[i]=arr[arr[i]-1];
                    arr[temp-1]=temp;
                    i--;
                }
            }
        }
        return ll;
        
    }
}