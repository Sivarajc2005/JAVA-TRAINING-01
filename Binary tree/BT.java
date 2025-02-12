 //height of the tree ------------------->
 
 // Step 01 : Creating a class 
 
 class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    
    // constructor 
    
    TreeNode(int value){
        this.value=value;
        this.left=null;
        this.right=null;
    }
}

public class BT{
    
    public int height(TreeNode root){
        if(root==null){
            return -1;
        }
        
        int leftHeight=height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight)+1;
    }
    
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
       BT  tree = new BT();
       System.out.println("Height of the tree:" + tree.height(root));
    }
}