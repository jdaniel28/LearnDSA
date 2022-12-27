class Solution {
    public int minDepth(TreeNode root) {
        int count = 0;
        if(root != null){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        ++count;
        while(!q.isEmpty()){
            int qSize = q.size();
            for(int i = 0;i<qSize;i++){
                 TreeNode node = q.poll();
                if(node.left == null && node.right == null){
                     return count;
                }
                if(node.left != null){
                 q.add(node.left);   
                }if(node.right != null){
                    q.add(node.right);
                }
            }
              ++count;
        }
    }
    return count;
    }
}