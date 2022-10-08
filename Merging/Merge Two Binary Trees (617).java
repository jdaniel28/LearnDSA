 public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root2 == null){
            return root1;
        }
        else if(root1 == null){
            return root2;
        }
        mergeNodes(root1, root2);
        return root1;
    }
    
    private void mergeNodes(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){
            return;
        }
        else {
            root1.val = root1.val + root2.val;
            if(root1.left == null && root2.left != null){
                root1.left = new TreeNode();
            }else if(root2.left == null && root1.left != null){
                root2.left = new TreeNode();
            }
            if(root1.right == null && root2.right != null){
                root1.right = new TreeNode();
            }else if(root2.right == null && root1.right != null){
                root2.right = new TreeNode();
            }
            mergeNodes(root1.right,root2.right);
            mergeNodes(root1.left,root2.left);
        }
    }