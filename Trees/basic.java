class Node{
  int val;
  Node left;
  Node right;

  Node(int val){
    this.val =  val;
  }

}


public class basic{
  public static void display(Node root){
    if(root == null) return ;
    System.out.print(root.val + " ");
    display(root.left);
    display(root.right);
  }
  
  public static void main(String[] args){
    Node root = new Node(10);
    Node a = new Node(20);
    Node b = new Node(30);
    Node c = new Node(40);
    Node d = new Node(50);
    root.left = a;
    root.right = b;
    
    a.left = c;
    a.right = d;
    display(root);
  }
} 

