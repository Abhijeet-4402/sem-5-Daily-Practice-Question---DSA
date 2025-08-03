// Last updated: 4/8/2025, 12:03:28 am
class Solution {
    public int minIncrementForUnique(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] <= arr[i - 1]) {
                count += arr[i - 1] - arr[i] + 1;
                arr[i] = arr[i - 1] + 1;
            }
        }
        return count;
    }
}
