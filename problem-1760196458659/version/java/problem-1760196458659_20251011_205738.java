// Last updated: 11/10/2025, 8:57:38 pm
class ExamTracker {
    private List<Integer> times;
    private List<Long> pre;

    public ExamTracker() {
        this.times = new ArrayList<>();
        this.pre = new ArrayList<>();
    }
    
    public void record(int time, int score) {
        times.add(time);
        long Total = pre.isEmpty() ? 0 : pre.get(pre.size() - 1);
        pre.add(Total + score);
    }
    
    public long totalScore(int startTime, int endTime) {
    		if(times.isEmpty()) return 0;
    		
    		int s = start(times,startTime);
    		int e = end(times, endTime);
    		
    		return s > e ? 0 : pre.get(e) - (s > 0 ? pre.get(s - 1) : 0);
    }

    private int start(List<Integer> t, int val) {
        int l = 0, r = t.size() - 1, ans = t.size();
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (t.get(m) >= val) {
                ans = m;
                r = m - 1;
            } else l = m + 1;
        }
        return ans;
    }

    private int end(List<Integer> t, int val) {
        int l = 0, r = t.size() - 1, ans = t.size();
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (t.get(m) > val) {
                ans = m;
                r = m - 1;
            } else l = m + 1;
        }
        return ans - 1;
    }
}

/**
 * Your ExamTracker object will be instantiated and called as such:
 * ExamTracker obj = new ExamTracker();
 * obj.record(time,score);
 * long param_2 = obj.totalScore(startTime,endTime);
 */