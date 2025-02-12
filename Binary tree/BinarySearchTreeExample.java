import java.util.Scanner;

// step 01 : creating a class

class TreeNode{
    int  value;
    TreeNode left, right;
    
    // constructor 
    
    public TreeNode(int value){
        this.value=value;
        this.left=null;
        this.right=null;
    }
}

public class BinarySearchTreeExample{
    public static boolean isBinarySearchTree(TreeNode root){
        return isBinarySearchTreeHello(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private static boolean isBinarySearchTreeHello(TreeNode node, int min, int max){
        if(node==null){
            return true;
        }
        
       if(node.value <=min || node.value>=max){
           return false;
       }
       
       return isBinarySearchTreeHello(node.left ,min, node.value) && isBinarySearchTreeHello(node.right,node.value,max);
       
    }
    
    // Function to insert the nodes into the Tree
    
    public static TreeNode inserting(TreeNode root, int value){
        if(root==null){
            return new TreeNode(value);
        }
        if(value<root.value){
            root.left=inserting(root.left,value);
        }
        else{
            root.right=inserting(root.right,value);
        }
        return root;
    }
    
    // main function 
     
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the no of nodes in the tree :");
         int n=scanner.nextInt();
         TreeNode root=null;
         System.out.println("Enter the values of the nodes:");
         for(int i=0; i<n; i++){
             int value = scanner.nextInt();
             root=inserting(root, value);
         }
         
         // checking if the tree is BST or not 
         
         if(isBinarySearchTree(root)){
             System.out.println("The tree is binary Search Tree");
         }
         else{
             System.out.println("The tree is NOT a Binary Search Tree");
         }
         
           scanner.close();
     }
   
    
}