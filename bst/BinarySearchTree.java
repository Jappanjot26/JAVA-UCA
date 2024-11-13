import java.io.*;

public class BinarySearchTree<Key extends Comparable<Key>, Value>
{
  class Node
  {
    Key key;
    Value value;
    Node left;
    Node right;
    int count;
    
    Node(Key key, Value value, int count)
    {
      this.key = key;
      this.value = value;
      this.left = null;
      this.right = null;
      this.count = count;
    }
  }

  Node root;

  BinarySearchTree()
  {
    this.root = null;
  }

  public Value get(Key key)
  {
    return get(root, key);
  }

  private Value get(Node x, Key key)
  {
    if(x == null) return null;

    int c = key.compareTo(x.key);
    if(c == 0) return x.value;
    else if(c < 0) return get(x.left, key);
    else return get(x.right, key);
  }

  public void put(Key key, Value value)
  {
    root = put(root, key, value);
  }
  
  private Node put(Node x, Key key, Value value)
  {
    if(x == null) return new Node(key, value, 1);

    int c = key.compareTo(x.key);
    if(c == 0) x.value = value;
    else if(c < 0) x.left = put(x.left, key, value);
    else x.right = put(x.right, key, value);

    x.count = 1 + size(left) + size(right);
    return x;
  }

  public Key floor(Key key)
  {
    Node x = floor(root, key);
    if(x == null) return null;
    return x.key;
  }

  private Node floor(Node x, Key key)
  {
    if (x == null) return null;

    int cmp = key.compareTo(x.key);
    if (cmp == 0) return x;
    if (cmp < 0) return floor(x.left, key);

    Node t = floor(x.right, key);
    if (t == null) return x;
    else return t;
  }

  public int size(){
    return size(root);
  }
  private int size(Node x){
    if(x == null) return 0;
    return x.count;
  }

  public int rank(Key key){
    return rank(key, root);
  }

  private int rank(Key key, Node x){
    if(x == null) return 0;
    int cmp = key.compareTo(x.key);
    if(cmp < 0) return rank(key, x.left);
    else if(cmp > 0) return 1 + size(x.left) + rank(key, x.right);
    else return size(x.left);
  }

  // ciel, inorder, postorder, preorder, delete

  public static void main(String[] args) throws IOException
  {
    BinarySearchTreexxxxxxxxxl<Integer, Integer> bst = new BinarySearchTree<>();
    
    bst.put(5, 3);
    bst.put(3, 5);
    bst.put(1, 6);
    bst.put(7, 3);
    bst.put(9, 1);

    // assert bst.get(7) == 3;
    // assert bst.get(11) == null;
    // assert bst.get(1) == 6;
    // assert bst.floor(8) == 7;
    // assert bst.floor(10) == 9;
    // assert bst.floor(0) == null;

    System.out.println(bst.get(7));
    System.out.println(bst.floor(10));

    // Download file from https://introcs.cs.princeton.edu/java/data/leipzig/leipzig1m.txt
    // FileReader fileReader = new FileReader("leipzig1m.txt");
    // BufferedReader br = new BufferedReader(fileReader);
    // Integer maxCount = 0;
    // String hFreqWord = "";
    // BinarySearchTree<String, Integer> bst = new BinarySearchTree<>();
    

    // while(br.ready())
    // {
    //    String line = br.readLine();
    //    String[] words = line.split(" ");
 
    //    for(String word: words)
    //    {
    //      if(word.length() < 10) continue;

    //      Integer count = bst.get(word);
    //      if(count != null)
    //      {
    //        bst.put(word, count+1);
    //        if(count+1 > maxCount)
    //        {
    //          maxCount = count+1;
    //          hFreqWord = word;
    //        }
    //      }
    //      else {
    //        bst.put(word, 1);
    //      }
    //    } 
    // }
    // System.out.println(hFreqWord + " " + maxCount);
  }
}