// Last updated: 22/3/2026, 12:23:30 am
1class Solution {
2    static final boolean [] arr = new boolean[10001];
3	static final ArrayList<Integer> primes = new ArrayList<>();
4	static boolean solved = false;
5	public static int minSteps(int n) {
6		if(!solved) precompute();
7        if(arr[n]) return n;
8		int i = 0;
9		int ans = 0;
10		while(n>1) {
11			int p = primes.get(i);
12			while(n%p==0) {
13				n/=p;
14				ans+=p;
15			}
16			i++;
17		}
18		return ans;
19    }
20	
21	private static void precompute() {
22	    Arrays.fill(arr, true);
23	    arr[0] = arr[1] = false;
24	    for (int p = 2; p * p < arr.length; p++) {
25	        if (arr[p]) {
26	            for (int i = p * p; i < arr.length; i += p) {
27	                arr[i] = false;
28	            }
29	        }
30	    }
31	    
32	    for(int i = 2; i < arr.length; i++) {
33	    	if(arr[i])primes.add(i);
34	    }
35	}
36}
37