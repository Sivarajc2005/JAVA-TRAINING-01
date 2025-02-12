import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TreeNode{
    int value;
    TreeNode left, right;
    
    // creating constructor 
    
    TreeNode(int value){
        this.value=value;
        this.left=null;
        this.right=null;
    }
}

public class MergingBST{
    // -In order traversal 
    
    public static void inorderTraversal(TreeNode root,List<Integer> totalresult) {
        if(root==null)
        return;
        inorderTraversal(root.left, totalresult);  // traverse left subtree
        totalresult.add(root.value); // current node 
        inorderTraversal(root.right, totalresult); // traverse right subtree
    }
    
    // sort list to a balanced BST 
    
    public static TreeNode sortingListBST(List<Integer>list, int start,  int end){
        if(start>end)
        return null;
        
        // middle elements
        int mid = (start + end ) / 2;
        TreeNode node = new TreeNode(list.get(mid));
        
        // recursive for left and right subtree
        
        node.left = sortingListBST(list,start,mid -1);
        node.right = sortingListBST(list,mid + 1, end);
        
        return node;
    
    }
    
    //merge two balanced BST 
    
    public static TreeNode MergingBST(TreeNode root1, TreeNode root2){
        List<Integer> list = new ArrayList<>();
        
        inorderTraversal(root1, list);
        inorderTraversal(root2, list);
        
        Collections.sort(list);
        
        return sortingListBST(list, 0, list.size()-1);
    }
    
    // print the tree (in-order traversal)
    
    public static void printingtheTree(TreeNode root){
        if(root!=null){
            printingtheTree(root.left);
            System.out.println(root.value + "");
            printingtheTree(root.right);
            
        }
    }
     
    // main function 
    
    public static void main(String[] args){
        TreeNode tree1 = new TreeNode(4);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(6);
        tree1.left.left=new TreeNode(1);
        tree1.left.right = new TreeNode(3);
        tree1.right.left = new TreeNode(5);
        tree1.right.right = new TreeNode (7);
        
        
        TreeNode tree2 = new TreeNode(8);
        tree2.left = new TreeNode(5);
        tree2.right = new TreeNode(10);
        tree2.left.left = new TreeNode(4);
        tree2.left.right = new TreeNode(6);
        tree2.right.right = new TreeNode(12);
        
        TreeNode MergingTree = MergingBST(tree1, tree2);
        
        System.out.println("Merged BST:");
        printingtheTree(MergingTree);
    }
}