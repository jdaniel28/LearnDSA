/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root,0 ,0);
    }

    private int dfs(TreeNode root,int totalSum,int tempSum){
        if(root != null){
            tempSum = (tempSum * 10) + root.val;
            int tempCheck = 0;
            tempCheck += tempSum;
            int leftVal = dfs(root.left,totalSum, tempSum);
            int rightVal = dfs(root.right,totalSum, tempSum);
            if(tempCheck == leftVal && tempCheck == rightVal){
                return leftVal /2 + rightVal/2  + (leftVal % 2 + rightVal % 2) / 2;
            }
            else if(tempCheck == leftVal){
                leftVal = 0;
            }
            else if(tempCheck == rightVal){
                rightVal = 0;
            }
            return  leftVal + rightVal;
        }
        totalSum = totalSum + tempSum;
        return totalSum;
    }
}