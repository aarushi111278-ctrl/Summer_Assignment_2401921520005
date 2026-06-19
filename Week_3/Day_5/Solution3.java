class RecentCounter {
    ArrayDeque<Integer> deque;
    public RecentCounter() {
        deque=new ArrayDeque<>();
    }
    
    public int ping(int t) {
        deque.offer(t);
        while(deque.peek()<t-3000){
            deque.poll();
        }
        return deque.size();
    }
}
