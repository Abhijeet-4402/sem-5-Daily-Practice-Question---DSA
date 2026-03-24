// Last updated: 24/3/2026, 12:20:46 pm
1class NumArray {
2    private int n;
3    private int[] tree;
4    public NumArray(int[] nums) {
5        n = nums.length;
6        tree = new int[4*n];
7        build(nums, 1, 0, n-1);
8    }
9    public void build(int [] arr, int node, int st, int end){
10        if(st==end){
11            tree[node] = arr[st];
12            return;
13        }
14        int mid = st+(end-st)/2;
15        build(arr, 2*node, st, mid);
16        build(arr, 2*node+1, mid+1, end);
17        tree[node] = tree[2*node] + tree[2*node+1];
18    }
19    
20    public void update(int index, int val) {
21        update(1, 0, n-1, index, val);
22    }
23    private void update(int node, int st, int end, int pos, int val) {
24		if(st==end) {
25			tree[node] = val;
26			return;
27		}
28		int mid = st+(end-st)/2;
29		
30		if(pos<=mid) {
31			update(2*node, st, mid, pos, val);
32		}else {
33			update(2*node+1, mid+1, end, pos, val);
34		}
35		
36		tree[node] = tree[2*node] + tree[2*node+1];
37	}
38    
39    public int sumRange(int left, int right) {
40        return query(1, 0, n-1, left, right);
41    }
42
43    private int query(int node, int st, int end, int l, int r) {
44		if (r < st || end < l)
45			return 0;
46
47		if (l <= st && end <= r)
48			return tree[node];
49
50		int mid = st + (end - st) / 2;
51		int left = query(2 * node, st, mid, l, r);
52		int right = query(2 * node + 1, mid + 1, end, l, r);
53		return left + right;
54	}
55}
56
57/**
58 * Your NumArray object will be instantiated and called as such:
59 * NumArray obj = new NumArray(nums);
60 * obj.update(index,val);
61 * int param_2 = obj.sumRange(left,right);
62 */