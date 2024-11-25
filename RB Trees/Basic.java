
public class Basic {
  private Node root;
  private static final boolean RED = true;
  private static final boolean BLACK = false;
  public class Node {
  int key;
  Node left, right;
  boolean color; // true for Red, false for Black 

  public Node(int key) {
    this.key = key;
    this.left = null;
    this.right = null;
    this.color = true; // nodes are always initially
  }
}

  public Basic() {
    root = null;
  }

  private Node rotateLeft(Node h) {
    Node x = h.right;
    h.right = x.left;
    x.left = h;
    x.color = h.color;
    h.color = RED;
    return x;
  }

  private Node rotateRight(Node h) {
    Node x = h.left;
    h.left = x.right;
    x.right = h;
    x.color = h.color;
    h.color = RED;
    return x;
  }

  private void flipColors(Node h) {
    h.color = RED;
    h.left.color = BLACK;
    h.right.color = BLACK;
  }

  private boolean isRed(Node x) {
    if (x == null) return false;
    return x.color == RED;
  }

  public void insert(int key) {
    root = insert(root, key);
    root.color = BLACK;
  }

  private Node insert(Node h, int key) {
    if (h == null) return new Node(key);

    if (key < h.key) h.left = insert(h.left, key);
    else if (key > h.key) h.right = insert(h.right, key);
    else h.key = key;

    if (isRed(h.right) && !isRed(h.left)) h = rotateLeft(h);
    if (isRed(h.left) && isRed(h.left.left)) h = rotateRight(h);
    if (isRed(h.left) && isRed(h.right)) flipColors(h);

    return h;
  }

  public void inorder() {
    inorder(root);
  }

  private void inorder(Node x) {
    if (x == null) return;
    inorder(x.left);
    System.out.print(x.key + " ");
    inorder(x.right);
  }

  public static void main(String[] args) {
    Basic tree = new Basic();
    tree.insert(10);
    tree.insert(20);
    tree.insert(30);
    tree.insert(15);
    tree.insert(25);
    tree.inorder();
  }
}