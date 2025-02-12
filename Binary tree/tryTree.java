

public class tryTree {
    static class Node{
        String data;
        Node left;
        Node right;

        public Node(String data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    Node root;

    static int Finddepth(Node root,String target,int start){
        if(root==null) return -1;

        if(root.data.equals(target)) return start;

        int le=Finddepth(root.left,target,start+1);
        if(le!=-1){
            return le;
        }
        return Finddepth(root.right,target,start+1);
    }
     public static void main(String[] args) {
        Node root = new Node("Sivaraj");
        root.left=new Node("fiction");
        root.right=new Node("technology");
        root.left.left=new Node("mystry");
        root.right.left=new Node("programing");

        root.left.left.left=new Node("book1");
        root.right.left.left=new Node("java");

        System.out.println(Finddepth(root, "java", 0));
     }
}
