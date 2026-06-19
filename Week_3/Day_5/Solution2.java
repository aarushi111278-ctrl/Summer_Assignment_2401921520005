class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        Deque<Integer> deq=new LinkedList<>();
        for(int i=0;i<n;i++){
            while(!deq.isEmpty() && deq.peekFirst()<=i-k){
                deq.pollFirst();
            }
            while(!deq.isEmpty() && nums[deq.peekLast()]<nums[i]){
                deq.pollLast();
            }
            deq.offerLast(i);
            if(i>=k-1){
                ans[i-k+1]=nums[deq.peekFirst()];
            }
        }
        return ans;
    }
}
