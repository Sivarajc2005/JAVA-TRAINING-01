// Step 01 : creating a node ( BST)

class EmployeeUniqueIdBST{
    
    static class Node{
        int employeeID;
        Node left, right;
        
// creating a constructor for new node 

      public Node(int employeeID){
          this.employeeID=employeeID;
          left=right=null;
      }
    }
  // creating a root for the BST 
  
  Node root;  
  
  EmployeeUniqueIdBST(){
      root=null;
  }
   
  // creating a method for new employee id 
  
  void insert(int employeeID){
      root = InsertingVal(root, employeeID);
  }
  
  // Recursive method to insert the employee id 
  
  Node InsertingVal(Node root, int employeeID){
      if(root==null){
          root=new Node(employeeID);
          return root;
      }
      
  // employee id is smaller , move to the left child 
  
  if(employeeID < root.employeeID){
      root.left=InsertingVal(root.left,employeeID);
  }
  // employee id is larger, move to the right child 
  
  else if(employeeID>root.employeeID){
      root.right=InsertingVal(root.right,employeeID);
  }
  
  return root;
      
  }
    
   // minimum value (junior employee id ) 
   
   int findMinimum(){
       return findMiniumRec(root);
   }
   
   int findMiniumRec(Node root){
       while(root!=null && root.left !=null){
           root=root.left;
       }
       return root.employeeID;
   }
    
    // maximum value (senior employee id )
    
    int findMaximum(){
        return findMaximumRec(root);
    }
    
    int findMaximumRec(Node root){
        while(root !=null && root.right !=null){
            root=root.right;
        }
        return root.employeeID;
    }
    
    // in-order Traversal
    
    void inOrderTraversalMethod(Node root){
        if( root !=null){
            inOrderTraversalMethod(root.left);
            System.out.println(root.employeeID + " ");
            inOrderTraversalMethod(root.right);
        }
    }
    
    // main function 
    
    public static void main(String[] args){
        EmployeeUniqueIdBST tree = new EmployeeUniqueIdBST();
        
         tree.insert(15);
         tree.insert(10);
         tree.insert(20);
         tree.insert(9);
         tree.insert(12);
         tree.insert(18);
         tree.insert(29);
         
         System.out.println("Junior Employee(Minimum ID): " + tree.findMinimum());
         System.out.println("Senior Employee(Maximum ID): " +  tree.findMaximum());
        //  System.out.println(root);
    }
}



