import java.io.*;
import java.util.*;

/**
* This Class helps to check whether a tree in Symmetric (Mirron) or not
*
*/

class TreeMirrorTree {
  public static void main(String[] args) {
    //ArrayList<String> strings = new ArrayList<String>();
    /*for (String string : strings) {
      System.out.println(string);
    }*/


    TreeNode t1 = new TreeNode(1);
    TreeNode t1l = new TreeNode(2);
    TreeNode t1r = new TreeNode(2);
    t1.left = t1l;
    t1.right = t1r;

    TreeNode t2 = new TreeNode(1);
    TreeNode t2l = new TreeNode(2);
    TreeNode t2r = new TreeNode(2);
    t2.left = t2l;
    t2.right = t2r;

    TreeNode t2rl = new TreeNode(4);
    TreeNode t2rr = new TreeNode(5);
    t2r.left = t2rl;
    t2r.right = t2rr;

    TreeNode t2ll = new TreeNode(5);
    TreeNode t2lr = new TreeNode(4);
    t2l.left = t2ll;
    t2l.right = t2lr;

    System.out.println("isMirrorTree:: "+ isMirrorTree(t2));
  }

  public static boolean isMirrorTree(TreeNode a){

    //If root element is null it is Symmetric
    if(a == null) return true;

    //CHeck the left node is a mirron of right
    return isMirror(a.left, a.right);
  }

  public static boolean isMirror(TreeNode a, TreeNode b){

    /*If both nodes are null, the trees are Mirror */
    if(a == null && b == null){
      return true;
    }

    /* If one of the node is null and another is not,
      then they are not the Symmetric
    */
    if(a == null || a == null){
      return false;
    }

    System.out.println("a -> " + a.val);
    System.out.println("b -> " + b.val);

    // If node values are not equal, they are different
    if(a.val != b.val){
      return false;
    }

    //Node values are equal, continue with child nodes
    return isMirror(a.left, b.right)
        && isMirror(a.right, b.left);
  }


}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
      val = x;
    }
  }
