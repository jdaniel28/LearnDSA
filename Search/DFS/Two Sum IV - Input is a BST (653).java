public boolean findTarget(TreeNode root, int k) {
     Set<Integer> set = new HashSet<>();
    return dfs(root,k,set);
        
    }
    private boolean dfs(TreeNode root, int k, Set<Integer> set){
        boolean val = false;
        if(root != null){
            if(set.contains(k - root.val)){
                val = true;
            }
            set.add(root.val);
            val = val || dfs(root.left,k,set);
            val = val || dfs(root.right,k,set);
        }
        return val;
    }