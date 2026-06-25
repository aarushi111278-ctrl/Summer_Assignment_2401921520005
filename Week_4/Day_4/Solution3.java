class Solution {
    public int maxPathSum(TreeNode root) {
        int[] maxSum={Integer.MIN_VALUE};
        gain(root,maxSum);
        return maxSum[0];
    }
    public int gain(TreeNode root,int[] maxSum){
        if(root==null){
            return 0;
        }
        int left=Math.max(0,gain(root.left,maxSum));
        int right=Math.max(0,gain(root.right,maxSum));
        maxSum[0]=Math.max(maxSum[0],root.val+left+right);
        return root.val+Math.max(left,right);
    }
}
