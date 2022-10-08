 public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l1 =new ArrayList<>();
        if(root != null){
             dfs(l1,root);
        }
        return l1;
    }
    
    private void dfs(List<Integer> list, TreeNode root){
        if(root != null){
            dfs(list,root.left);
            list.add(root.val);
            dfs(list,root.right);
        }
    }