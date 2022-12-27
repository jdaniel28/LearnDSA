class Solution {
    public boolean isSymmetric(TreeNode root) {
        return symmetric(root, root);
    }
    
    private boolean symmetric(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null){
            return true;
        }else if(t1 == null || t2 == null || t1.val != t2.val){
            return false;
        }
        return symmetric(t1.left,t2.right) && symmetric(t1.right,t2.left);
    }
}