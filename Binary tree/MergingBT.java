//merge two binary trees

// Step 01 : creating a class node 

class TreeNode{
    int value;
    TreeNode left, right;

// Step 02 : create constructor 

    TreeNode(int value){
        this.value=value;
        this.left = null;
        this.right=null;
    }
}

// creating class for binary TreeNode

public class MergingBT{
    
    // Creating function for merging two binary trees 
    
    public static TreeNode mergeTrees(TreeNode tree1, TreeNode tree2){
        
        // if tree1 is null , returning to tree2 
        
        if(tree1==null)
        return tree2;
        
        // if tree2 is null, returning to tree1 
        
        if(tree2==null)
        return tree1;
        
        // both nodes are not null, sum their values 
        
        tree1.value +=tree2.value;
        
        // recursively merge the left and right children
        
        tree1.left = mergeTrees(tree1.left,tree2.left); // left subtrees 
        tree1.right=mergeTrees(tree1.right, tree2.right); // right subtrees
        return tree1;
        
    }
    
    // in-order traversal - left, root, right 
    
    public static void printingtheTrees(TreeNode root){
        if(root !=null){
            printingtheTrees(root.left);  // that means left child 
            System.out.println(root.value + " ");  // it is current root node 
            printingtheTrees(root.right); // that means right child 
        }
    }
    
    // main function 
    
    public static void main(String[] args){
        
        // constructing the tree tree1
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(3);
        tree1.right= new TreeNode(4);
        tree1.left.left=new TreeNode(5);
        tree1.left.right = new TreeNode(6);
        
        
        // constructing the tree 2 
        
        TreeNode tree2 = new TreeNode(2);
        tree2.left=new TreeNode(9);
        tree2.right = new TreeNode(10);
        tree2.right.left = new TreeNode(11);
        tree2.right.right = new TreeNode(12);
        
        TreeNode mergedtheTree = mergeTrees(tree1,tree2);
        System.out.println("Merged tree : In-order Traversal:");
        printingtheTrees(mergedtheTree);
    }
}