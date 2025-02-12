//Depth of the tree ------------->

class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BTDepth{
    public int findDepthoftheTree(TreeNode root, int target){
        return finddepthTree(root,target, 0);  // starting at the depth 0 
    }
    
    private int finddepthTree(TreeNode node, int target,int currentDepth){
        if(node==null){
            return -1;
        }
        
        if(node.value==target){
            return currentDepth;
        }
        
        int leftDepthoftheTree = finddepthTree(node.left,target,currentDepth + 1);
        if(leftDepthoftheTree !=-1){
            return leftDepthoftheTree;
        }
        return finddepthTree(node.right,target,currentDepth + 1);
    }
    
    // main function 
    
    public static void main(String[] args){ 
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        BTDepth tree = new BTDepth();
        
        int depth = tree.findDepthoftheTree(root, 4);
        System.out.println("Depth of the node 4 :" + depth);
        
        depth = tree.findDepthoftheTree(root,2);
        System.out.println("Depth of the node 2 :" + depth);
        
        depth = tree.findDepthoftheTree(root,1);
        System.out.println("Depth of the node 1:" + depth);
        
        depth = tree.findDepthoftheTree(root,5);
        System.out.println("Depth of the node 5:" + depth);
        
         depth = tree.findDepthoftheTree(root,3);
        System.out.println("Depth of the node 3:" + depth);
    }
}