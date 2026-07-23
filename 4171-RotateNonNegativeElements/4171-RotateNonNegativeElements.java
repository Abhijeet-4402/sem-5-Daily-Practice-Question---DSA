// Last updated: 23/7/2026, 9:35:09 am
class Solution {

    public int[] rotateElements(int[] nums, int k) {
        ArrayList<Integer> index = new ArrayList<>();
        ArrayList<Integer> value = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                value.add(nums[i]);
                index.add(i);
            }
        }

        if (value.size() == 0)
            return nums;
        rotate(value, k);

        for (int i = 0; i < value.size(); i++) {
            nums[index.get(i)] = value.get(i);
        }
        return nums;
    }

    private void rotate(ArrayList<Integer> ll, int k) {
        int n = ll.size();
        k = k % n;
        if (k == 0)
            return;
        reverse(ll, 0, k - 1);
        reverse(ll, k, n - 1);
        reverse(ll, 0, n - 1);
    }

    private void reverse(ArrayList<Integer> ll, int st, int end) {
        while (st < end) {
            int temp = ll.get(st);
            ll.set(st, ll.get(end));
            ll.set(end, temp);
            st++;
            end--;
        }
    }

}