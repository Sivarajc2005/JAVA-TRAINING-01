// Need to find the total cost of all the books and no of books 

class Node{
    int id;
    Node left,right;
    
    // constructor 
    
    public Node(int id){
        this.id=id;
        this.left=null;
        this.right=null;
    }
}

public class HomeBooks{
    public static Node inserting(Node root, int id ){
        // if the tree is empty , we have to create a new node 
        if(root==null){
            return new Node(id);
        }
        
        // recursive 
        
        if(id<root.id){
            root.left=inserting(root.left,id);
        }else if(id>root.id){
            root.right=inserting(root.right,id);
        }
        return root;
    }
    
    // calculate both sum of the ids for all the books and counting the UnsupportedClassVersionError
    
    public static int[] SumandCount(Node root){
        int[] result = new int[2];
        
        if(root==null){
            return result;
        }
        
        int[] leftResult = SumandCount(root.left);
        int[] rightResult = SumandCount(root.right);
        
        result[0] = root.id + leftResult[0] + rightResult[0];
        result[1]=  1 + leftResult[1] + rightResult[1];
        return result;
    }
    // main function 
     
      public static void main(String[] args){
          Node root = null;
          
          int[] bookIds = {50,30,70,20,40,60,80};
          for(int id : bookIds){
              root = inserting(root,id);
          }
          
          int[] result = SumandCount(root);
          
          System.out.println("Sum of all the Book IDS:" + result[0]);
          System.out.println("Total no of books:" + result[1]);
          
      }
    
    
}