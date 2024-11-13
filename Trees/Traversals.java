import java.util.*;

class Node{
  int val;
  Node left;
  Node right;

  Node(int val){
    this.val = val;
  }
}

public class Traversals{
  public static void inorderRecursion(Node root){
    if(root == null) return ;
    
    inorderRecursion(root.left);
    System.out.print(root.val + " ");
    inorderRecursion(root.right);
  }
  public static void preorderRecursion(Node root){
    if(root == null) return ;

    System.out.print(root.val + " ");
    preorderRecursion(root.left);
    preorderRecursion(root.right);
  }
  public static void postorderRecursion(Node root){
    if(root == null) return ;

    postorderRecursion(root.left);
    postorderRecursion(root.right);
    System.out.print(root.val + " ");
  }

  public static void inorderIteration(Node root){
    if(root == null) return;
    Stack<Node> st = new Stack<>();
    Node node = root;
    while(true){
      if(node != null){
        st.push(node);
        node = node.left;
      } else {
        if(st.isEmpty()) break;

        node = st.pop();
        System.out.print(node.val + " ");
        node = node.right;
      }
    }
    System.out.println();
  }
  public static void preorderIteration(Node root){
    if(root == null) return;
    Deque<Node> st = new LinkedList<>();
    st.push(root);
    while(!st.isEmpty()){
      Node temp = st.peek();
      st.pop();
      System.out.print(temp.val + " ");
      if(temp.right != null) st.push(temp.right);
      if(temp.left != null) st.push(temp.left);
    }
    System.out.println("");
  }
  public static void postorderIteration2Stacks(Node root){
    if(root == null) return ;
    Stack<Node> s1 = new Stack<>();
    Stack<Node> s2 = new Stack<>();
    s1.push(root);
    Node node;
    while(!s1.isEmpty()){
      node = s1.pop();
      s2.push(node);
      if(node.left != null) s1.push(node.left);
      if(node.right != null) s1.push(node.right);
    }
    while(!s2.isEmpty()){
      System.out.print(s2.pop().val + " ");
    }
    System.out.println();
  }
  public static void postorderIteration1Stack(Node root){

  }
  public static void main(String args[]){
    Node n1 = new Node(5);
    n1.left = new Node(7);
    n1.right = new Node(9);
    n1.left.left = new Node(2);
    n1.right.left = new Node(1);
    System.out.println("Using Recursion :");
    inorderRecursion(n1);
    System.out.println("");
    preorderRecursion(n1);
    System.out.println("");
    postorderRecursion(n1);
    System.out.println("");

    System.out.println("Using Iteration :");
    inorderIteration(n1);
    preorderIteration(n1);
    postorderIteration2Stacks(n1);

  }
}