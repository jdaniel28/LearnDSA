public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
    
    private void invert(TreeNode root){
        if(root !=null){
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
            invert(root.left);
            invert(root.right);
        }
    }